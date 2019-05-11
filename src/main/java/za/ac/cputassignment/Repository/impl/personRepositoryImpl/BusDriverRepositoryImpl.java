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


    private BusDriver findBusDriver(String BusDriverId)
    {
        return this.busDrivers.stream()
                                .filter(busDriver -> busDriver.getDriverID().trim().equals(BusDriverId))
                                .findAny()
                                .orElse(null);
    }

    public static BusDriverRepository getRepository()
    {
        if(repository ==null) repository =new BusDriverRepositoryImpl();
        return repository;
    }




    @Override
    public BusDriver create(BusDriver busDriver) {
        this.busDrivers.add(busDriver);
        return busDriver;
    }
    @Override
    public BusDriver read(String BusDriverId) {
       BusDriver busDriver= findBusDriver(BusDriverId);
        return busDriver;
    }

    @Override
    public void delete(String busDriverId) {
        BusDriver busDriver=findBusDriver(busDriverId);
        if(busDriver !=null) this.busDrivers.remove(busDriver);
    }


    @Override
    public BusDriver update(BusDriver busDriver) {
        BusDriver busDriver1=findBusDriver(busDriver.getDriverID());
        if(busDriver1 !=null) {
            this.busDrivers.remove(busDriver1);
        }
        return null;

    }




    @Override
    public Set<BusDriver> getAll() {
        return this.busDrivers;
    }

}
