 package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.RideStatusRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.service.eventTriggerService.RideStatusService;

import java.util.Set;

@Service("ServiceImpl")
public class RideStatusServiceImpl implements RideStatusService {

    @Autowired
    @Qualifier
    private RideStatusRepository repository;

    private RideStatusServiceImpl()
    {
        this.repository = RideStatusRepositoryImpl.getRepository();
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



