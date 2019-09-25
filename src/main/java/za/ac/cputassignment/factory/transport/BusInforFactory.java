package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.util.Misc;

public class BusInforFactory {

    public static BusInfor BuilderGeneric(String busVehicle)
    {

        return  new BusInfor.Builder()
                            .setVehicleBusId(Misc.generatedId())
                            .VehicleBus(busVehicle)
                            .buid();



    }


}
