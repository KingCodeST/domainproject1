package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.HashSet;
import java.util.Set;
@Repository("InMemory")
public class BusDriverRepositoryImpl implements BusDriverRepository {

    private static BusDriverRepositoryImpl repository=null;
    private Set<Driver> drivers;

    public BusDriverRepositoryImpl()
    {
        this.drivers =new HashSet<>();
    }


    private Driver findBusDriver(String BusDriverId)
    {
        return this.drivers.stream()
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
    public Driver create(Driver driver) {
        this.drivers.add(driver);
        return driver;
    }
    @Override
    public Driver read(String BusDriverId) {
       Driver driver = findBusDriver(BusDriverId);
        return driver;
    }

    @Override
    public void delete(String busDriverId) {
        Driver driver =findBusDriver(busDriverId);
        if(driver !=null) this.drivers.remove(driver);
    }


    @Override
    public Driver update(Driver driver) {
        Driver driver1 =findBusDriver(driver.getDriverID());
        if(driver1 !=null) {
            this.drivers.remove(driver1);
        }
        return null;

    }




    @Override
    public Set<Driver> getAll() {
        return this.drivers;
    }

}
