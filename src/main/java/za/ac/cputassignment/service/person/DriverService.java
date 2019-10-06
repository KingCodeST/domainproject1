package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface DriverService extends IService<Driver,String> {
    Driver retrieveByDesc(String driverDesc);
    List<Driver> getAll();
}
