package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TokenRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TokenRepository tokenRepository;

    public TokenService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TokenRepository tokenRepository
    ){
        this.gateRepository=gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.parkingLotRepository=parkingLotRepository;
        this.tokenRepository=tokenRepository;
    }
    public Token issueToken(
    Long gateId,
   VehicleType vehicleType,
    String vehicleNumber,
    String ownerName
    ){
        //1. create token
        Token token=new Token();
        token.setEntryTime(new Date());
        //Using the gateId we need the gate object from database
        Optional<Gate> gateOptional=gateRepository.findGatebyId(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException("Invalid gate is entered!");
        }
        Gate gate=gateOptional.get();
        token.setGeneratedAt(gate);
        token.setGeneratedBy(gate.getOperator());

        //check if the vehicle already exists
        Optional<Vehicle>vehicleOptional= vehicleRepository.findVehcleBNumber(vehicleNumber);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            //since this is the new vehicle
            // lets create the object and save it in the db
            Vehicle vehicle=new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            savedVehicle=vehicleRepository.save(vehicle);
        }else{
            //if the vehicle already exists
            savedVehicle=vehicleOptional.get();
        }
        token.setVehicle(savedVehicle);

        //2. Assign a slot
            //we can have different strategies to allocate slot
         ParkingLot parkingLot=parkingLotRepository.findParkingLotByGate(gate);
        ParkingSlot parkingSlot=SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                .getSlot(parkingLot,vehicleType);

        token.setAssignedSlot(parkingSlot);
        parkingSlot.setSlotStatus(SlotStatus.FILLED);

        Token savedToken=tokenRepository.save(token);
        savedToken.setNumber(savedToken.getId()+"-Token");

        //3. Return
        return savedToken;

    }
}
