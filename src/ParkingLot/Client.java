package ParkingLot;

import ParkingLot.controllers.TokenController;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TokenRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TokenService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository=new GateRepository();
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        TokenRepository tokenRepository=new TokenRepository();
        VehicleRepository vehicleRepository=new VehicleRepository();

        TokenService tokenService=new TokenService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository
        );

        TokenController tokenController=new TokenController(tokenService);
    }
}

//Controllers->->Services->Repositories
