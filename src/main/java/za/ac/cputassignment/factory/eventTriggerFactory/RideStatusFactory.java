package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;

public class RideStatusFactory {


    public static RideStatus getRideStatus(String RsId)
    {
        return  new RideStatus.Builder()
                              .id(RsId)
                              .build();
    }


}
