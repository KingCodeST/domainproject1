package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.Ride;

public class RideFactory {

    public static Ride getRide(String RideId,String colo)
    {
        return  new Ride.Builder()
                                .Rideid(RideId)
                                .color(colo)
                                .build();
    }

}
