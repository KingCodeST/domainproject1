package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.transport.Bus;

public class BusFactory {

    public static Bus getBus(String brandname,int enginename,String modeln,int quantity,String roadWorty)
    {
        return new Bus.Builder()
                      .brandName(brandname)
                      .engineNumber(enginename)
                      .modelNo(modeln)
                      .quantity(quantity)
                      .roadWorty(roadWorty)
                      .build();



    }




}
