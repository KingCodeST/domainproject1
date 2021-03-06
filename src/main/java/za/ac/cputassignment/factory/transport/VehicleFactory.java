package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.util.Misc;

public class VehicleFactory {

    public static Vehicle BuilderGeneric(String capacity,String typeVehicle,String disklicense)
    {

        return  new Vehicle.Builder()
                .setVicleId(Misc.generatedId())
                .setCapacity(capacity)
                .setTypeVehicle(typeVehicle)
                .setDisklicense(disklicense)
                .build();


    }

}
