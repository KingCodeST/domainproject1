package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface BusService extends IService<Bus,String> {
    Set<Bus>getAll();
}
