package za.ac.cputassignment.service.service.eventTriggerService;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface RideStatusService extends IService<RideStatus,String> {
    Set<RideStatus> getAll();
}
