package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.transport.Van;

public class VanFactory {



    public static Van getVan()
    {

        return  new Van.Builder()

                .brand("BMW")
                .numPlate("CEM87930")
                .patrol(90.9)
                .build();


    }



}
