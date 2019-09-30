package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.util.Misc;

public class BusInforFactory {

    public static BusInfor BuilderGeneric(String busVehicle,String n)
    {

        return  new BusInfor(busVehicle);



    }


    public static BusInfor BuilderGeneric(String busInfo) {
        return  new BusInfor(busInfo);
    }
}
