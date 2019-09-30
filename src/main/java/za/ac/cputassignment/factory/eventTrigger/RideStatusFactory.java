package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.util.Misc;

public class RideStatusFactory {

   private static boolean status;
    public static RideStatus GenericBuilder(String ridestatus)
    {

        return  new RideStatus.Builder()
                              .setRideStatusId(Misc.generatedId())

                              .setOn(status)
                              .build();

    }





}
