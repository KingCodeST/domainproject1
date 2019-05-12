package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.DriverInfor;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface BusDriverInforService extends IService<DriverInfor,String> {
    Set<DriverInfor> getAll();
}
