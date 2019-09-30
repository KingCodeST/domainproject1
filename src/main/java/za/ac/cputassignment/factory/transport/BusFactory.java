package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.util.Misc;

public class BusFactory {

    private static String brandname,modeln,roadWorty;
    private static  int quantity,enginename;
    public static Bus getBus(String bus)
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
