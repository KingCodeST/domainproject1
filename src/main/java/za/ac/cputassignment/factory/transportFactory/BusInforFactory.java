package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.transport.BusInfor;

public class BusInforFactory {

    public static BusInfor getBusInfor(String busId,int year)
    {
        return  new BusInfor.Builder()
                            .id(busId)
                            .yearsofservice(year)
                            .buid();

    }


}
