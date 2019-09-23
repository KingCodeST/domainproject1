package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;

public class RideStatusFactory {


    public static RideStatus GenericBuilder(boolean status)
    {
        return  new RideStatus.Builder()
                              .setOn(status)
                              .build();
    }


}
