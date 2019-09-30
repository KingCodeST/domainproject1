package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.util.Misc;

public class RideFactory {

    public static Ride GenericBuilder(String rides)
    {
        return  new Ride.Builder()
                                .setRideNumber(Misc.generatedId())


                                .build();
    }

}
