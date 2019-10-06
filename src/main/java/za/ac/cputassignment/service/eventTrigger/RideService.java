package za.ac.cputassignment.service.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface RideService extends IService<Ride,String> {
    Ride retrieveByDesc(String rideDesc);
    List<Ride> getAll();
}
