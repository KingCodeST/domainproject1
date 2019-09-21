package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface BusDriverService extends IService<Driver,String> {
    Set<Driver> getAll();

}
