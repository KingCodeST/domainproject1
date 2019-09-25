package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.util.Misc;

public class VanFactory {



    public static Van getVan(String id,String brand,String numPlate,double patrol)
    {

        return  new Van.Builder()
                .vanId(Misc.generatedId())
                .brand(brand)
                .numPlate(numPlate)
                .patrol(patrol)
                .build();


    }



}
