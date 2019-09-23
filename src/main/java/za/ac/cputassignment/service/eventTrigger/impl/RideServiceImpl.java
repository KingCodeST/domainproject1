package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.Set;

@Service("serviceImpl")
public class RideServiceImpl implements RideStatusService {
    @Override
    public Set<RideStatus> getAll() {
        return null;
    }

    @Override
    public RideStatus create(RideStatus rideStatus) {
        return null;
    }

    @Override
    public RideStatus read(String s) {
        return null;
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
