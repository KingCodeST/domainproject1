package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.Van;

public class VanFactory {



    public static Van getVan(String id,String brand,String numPlate,double patrol)
    {

        return  new Van.Builder()
                .vanId(id)
                .brand(brand)
                .numPlate(numPlate)
                .patrol(patrol)
                .build();


    }



}
