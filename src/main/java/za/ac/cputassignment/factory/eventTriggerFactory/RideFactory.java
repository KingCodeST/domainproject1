package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.Ride;

public class RideFactory {

    public static Ride getRide()
    {
        return  new Ride.Builder().Rideid("232").color("Color").build();
    }

}
