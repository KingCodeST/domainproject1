package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.transport.Van;

public class VanFactory {



    public static Van getVan(String id,String brand,String numPlate,double patrol)
    {

        return  new Van.Builder()
                .vanId("")
                .brand("BMW")
                .numPlate("CEM87930")
                .patrol(90.9)
                .build();


    }



}
