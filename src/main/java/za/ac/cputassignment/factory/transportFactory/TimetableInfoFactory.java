package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

public class TimetableInfoFactory {


    public static TimetableInfo getTimetableInfo(String Tid)
    {


        return  new TimetableInfo.Builder()
                                .Id(Tid)
                                .build();


    }


}
