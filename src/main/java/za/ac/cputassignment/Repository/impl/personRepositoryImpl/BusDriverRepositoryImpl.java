package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.BusDriver;

import java.util.HashSet;
import java.util.Set;

public class BusDriverRepositoryImpl implements BusDriverRepository {

    private static BusDriverRepositoryImpl repository=null;
    private Set<BusDriver> busDrivers;

    public BusDriverRepositoryImpl()
    {
        this.busDrivers =new HashSet<>();
    }

    public static BusDriverRepository getRepository()
    {
        if(repository ==null) repository =new BusDriverRepositoryImpl();
        return repository;
    }



    @Override
    public Set<BusDriver> getAll() {
        return this.busDrivers;
    }

    @Override
    public BusDriver create(BusDriver busDriver) {
        this.busDrivers.add(busDriver);
        return busDriver;
    }

    @Override
    public BusDriver update(BusDriver busDriver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BusDriver read(String s) {
        return null;
    }
}
