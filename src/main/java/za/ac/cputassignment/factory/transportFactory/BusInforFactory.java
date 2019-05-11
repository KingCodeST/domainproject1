package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.transport.BusInfor;

public class BusInforFactory {

    public static BusInfor getBusInfor()
    {
        return  new BusInfor.Builder()
                            .id("231")
                            .yearsofservice(1)
                            .buid();

    }


}
