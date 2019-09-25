package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;
import za.ac.cputassignment.Repository.eventTrigger.impl.RideStatusRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideService;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.Set;

@Service("serviceImpl")
public class RideStatusServiceImpl implements RideStatusService {
    
    private static RideStatusServiceImpl service=null;
    private RideStatusRepository repository;

    private RideStatusServiceImpl(){
        this.repository = RideStatusRepositoryImpl.getRepository();
    }

    public static RideStatusServiceImpl getService(){
        if(service ==null) service =new RideStatusServiceImpl();
        return service;
    }



    @Override
    public Set<RideStatus> getAll() {
        return this.repository.getAll();
    }

    @Override
    public RideStatus create(RideStatus rideStatus) {

        return this.repository.create(rideStatus);
    }

    @Override
    public RideStatus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        return this.repository.update(rideStatus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}