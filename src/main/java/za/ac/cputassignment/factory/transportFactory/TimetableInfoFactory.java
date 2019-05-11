package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

public class TimetableInfoFactory {


    public static TimetableInfo getTimetableInfo()
    {


        return  new TimetableInfo.Builder()
                                .Id("343")
                                .build();


    }


}
