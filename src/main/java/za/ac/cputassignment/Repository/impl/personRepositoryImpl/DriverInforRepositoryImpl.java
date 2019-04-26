package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverInfor;

import java.util.HashSet;
import java.util.Set;

public class DriverInforRepositoryImpl implements DriverInforRepository {

    private static DriverInforRepositoryImpl repository=null;
    private Set<DriverInfor> driverInfors;

    private DriverInforRepositoryImpl()
    {
        this.driverInfors =new HashSet<>();
    }

    private DriverInforRepository getRepository()
    {
        if(repository ==null ) repository =new DriverInforRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DriverInfor> getAll() {
        return this.driverInfors;
    }

    @Override
    public DriverInfor create(DriverInfor driverInfor) {
        this.driverInfors.add(driverInfor);
        return driverInfor;
    }

    @Override
    public DriverInfor update(DriverInfor driverInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DriverInfor read(String s) {
        return null;
    }
}
