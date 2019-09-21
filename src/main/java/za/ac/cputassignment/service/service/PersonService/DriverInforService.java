package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface DriverInforService extends IService<DriverBus,String> {
    Set<DriverBus> getAll();
}
