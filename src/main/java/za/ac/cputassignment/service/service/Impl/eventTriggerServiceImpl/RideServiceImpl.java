package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.RideRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.service.service.eventTriggerService.RideService;

import java.util.Set;

@Service
public class RideServiceImpl implements RideService {

    private static RideServiceImpl service =null;
    private RideRepository repository;

    private RideServiceImpl()
    {
        this.repository = RideRepositoryImpl.getRepository();

    }

    public  static RideServiceImpl getService()
    {
        if(service ==null) service =new RideServiceImpl();
        return service;
    }

    @Override
    public Set<Ride> getAll() {
        return null;
    }

    @Override
    public Ride create(Ride ride) {
        return null;
    }

    @Override
    public Ride read(String s) {
        return null;
    }

    @Override
    public Ride update(Ride ride) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
