package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface DriverBusService extends IService<DriverBus,String> {
    Set<DriverBus>getAll();
}
