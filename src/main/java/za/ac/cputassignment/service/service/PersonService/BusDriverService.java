package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface BusDriverService extends IService<BusDriver,String> {
    Set<BusDriver> getAll();

}
