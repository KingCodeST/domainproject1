package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;

public class RideStatusFactory {


    public static RideStatus getRideStatus(boolean status)
    {
        return  new RideStatus.Builder()
                              .setOn(status)
                              .build();
    }


}
