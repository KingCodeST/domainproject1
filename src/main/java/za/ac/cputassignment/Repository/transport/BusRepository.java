package za.ac.cputassignment.Repository.transport;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.Bus;

import java.util.Set;

public interface BusRepository extends IRepository<Bus,String> {
    Set<Bus>getAll();
}
