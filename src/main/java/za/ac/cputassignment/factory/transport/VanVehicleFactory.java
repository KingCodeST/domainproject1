package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.VanVehicle;

public class VanVehicleFactory {

    public static VanVehicle BuilderGeneric(String van)
    {

        return  new VanVehicle.Builder()

                .VehicleVan(van)
                .build();


    }
}
