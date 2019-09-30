package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.util.Misc;

public class VanFactory {


        private static String id, brand, numPlate;
        private static double patrol;
    public static Van getVan(String van)
    {

        return  new Van.Builder()
                .vanId(Misc.generatedId())
                .brand(brand)
                .numPlate(numPlate)
                .patrol(patrol)
                .build();


    }



}
