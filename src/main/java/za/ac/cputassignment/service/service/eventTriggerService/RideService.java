package za.ac.cputassignment.service.service.eventTriggerService;

import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface RideService extends IService<Ride,String> {
    Set<Ride> getAll();
}
