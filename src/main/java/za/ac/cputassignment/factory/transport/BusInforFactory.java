package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.BusInfor;

public class BusInforFactory {

    public static BusInfor BuilderGeneric(String busVehicle)
    {

        return  new BusInfor.Builder()
                            .VehicleBus(busVehicle)
                            .buid();



    }


}
