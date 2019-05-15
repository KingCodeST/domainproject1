package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverInfor;

import java.util.*;
@Repository("InMemory")
public class DriverInforRepositoryImpl implements DriverInforRepository {

    private static DriverInforRepositoryImpl repository=null;
    private Map<String,DriverInfor> driverInfors;

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
    public DriverInfor create(DriverInfor driverInfor) {
       this.driverInfors.put(driverInfor.getId(),driverInfor);
       return this.driverInfors.get(driverInfor.getId());
    }

    @Override
    public DriverInfor update(DriverInfor driverInfor) {
        this.driverInfors.replace(driverInfor.getId(),driverInfor);
        return this.driverInfors.get(driverInfor.getId());
    }

    @Override
    public void delete(String s) {
        this.driverInfors.remove(s);
    }

    @Override
    public DriverInfor read(String driverId) {
        return this.driverInfors.get(driverId);
    }

    @Override
    public Set<DriverInfor> getAll() {
       Collection<DriverInfor> driverInfors=this.driverInfors.values();
       Set<DriverInfor> set =new HashSet<>();
       set.addAll(driverInfors);
       return set;
    }
}
