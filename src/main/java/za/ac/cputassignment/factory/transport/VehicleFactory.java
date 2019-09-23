package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Vehicle;

public class VehicleFactory {

    public static Vehicle BuilderGeneric(String capacity,String typeVehicle,String disklicense)
    {

        return  new Vehicle.Builder()
                .setCapacity(capacity)
                .setTypeVehicle(typeVehicle)
                .setDisklicense(disklicense)
                .build();


    }

}
