package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.util.Misc;

public class BusFactory {

    public static Bus getBus(String brandname,int enginename,String modeln,int quantity,String roadWorty)
    {
        return new Bus.Builder()
                      .setBusId(Misc.generatedId())
                      .brandName(brandname)
                      .engineNumber(enginename)
                      .modelNo(modeln)
                      .quantity(quantity)
                      .roadWorty(roadWorty)
                      .build();



    }




}
