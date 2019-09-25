package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.util.Misc;

public class RideStatusFactory {


    public static RideStatus GenericBuilder(boolean status)
    {
        return  new RideStatus.Builder()
                              .setRideStatusId(Misc.generatedId())
                              .setOn(status)
                              .build();
    }


}
