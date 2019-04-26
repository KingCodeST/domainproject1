package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;

public class RideStatusFactory {


    public static RideStatus getRideStatus()
    {
        return  new RideStatus();
    }


}
