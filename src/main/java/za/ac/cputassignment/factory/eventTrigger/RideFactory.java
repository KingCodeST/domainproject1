package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.Ride;

public class RideFactory {

    public static Ride GenericBuilder(String RideId,String colo)
    {
        return  new Ride.Builder()
                                .setRideNumber(RideId)

                                .build();
    }

}
