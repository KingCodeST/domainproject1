package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverBus;

import java.util.*;
@Repository("InMemory")
public class DriverInforRepositoryImpl implements DriverInforRepository {

    private static DriverInforRepositoryImpl repository=null;
    private Map<String, DriverBus> driverInfors;

    private DriverInforRepositoryImpl()
    {
        this.driverInfors =new HashMap<>();
    }

    public static DriverInforRepositoryImpl getRepository()
    {
        if(repository ==null ) repository =new DriverInforRepositoryImpl();
        return repository;
    }



    @Override
    public DriverBus create(DriverBus driverBus) {
       this.driverInfors.put(driverBus.getDriverId(), driverBus);
       return this.driverInfors.get(driverBus.getDriverId());
    }

    @Override
    public DriverBus update(DriverBus driverBus) {
        this.driverInfors.replace(driverBus.getDriverId(), driverBus);
        return this.driverInfors.get(driverBus.getDriverId());
    }

    @Override
    public void delete(String s) {
        this.driverInfors.remove(s);
    }

    @Override
    public DriverBus read(String driverId) {
        return this.driverInfors.get(driverId);
    }

    @Override
    public Set<DriverBus> getAll() {
       Collection<DriverBus> driverBuses =this.driverInfors.values();
       Set<DriverBus> set =new HashSet<>();
       set.addAll(driverBuses);
       return set;
    }
}
