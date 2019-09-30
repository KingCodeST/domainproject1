package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.VanVehicle;

public class VanVehicleFactory {

    public static VanVehicle BuilderGeneric(String van,String id)
    {

        return  new VanVehicle(id);


    }

    public static VanVehicle BuilderGeneric(String vanVehicle) {
        return  new VanVehicle(vanVehicle);
    }
}
