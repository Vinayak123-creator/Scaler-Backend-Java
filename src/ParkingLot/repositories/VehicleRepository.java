package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle>findVehcleBNumber(String number){
        return Optional.empty();
    }
    public Vehicle save(Vehicle vehicle){
        //certain actions to save the object
        return  vehicle;
    }

}
