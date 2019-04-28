package za.ac.cputassignment.factory.transportFactory;

import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

public class TimetableInfoFactory {


    public static TimetableInfo getTimetableInfo()
    {


        return  new TimetableInfo.Builder()
                                .timetableId(12)
                                .build();


    }


}
