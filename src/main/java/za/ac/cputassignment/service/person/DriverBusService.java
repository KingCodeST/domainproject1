package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface DriverBusService extends IService<DriverBus,String> {
    DriverBus retrieveByDesc(String driverBusDesc);
    List<DriverBus> getAll();
}
