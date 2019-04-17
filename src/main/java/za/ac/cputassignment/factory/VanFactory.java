package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.transport.Van;

public class VanFactory {

    public static Van getVan(String brand,String plate,double patrol)
    {

        return  new Van.Builder()

                .brand(brand)
                .numPlate(plate)
                .patrol(patrol)
                .build();


    }



}
