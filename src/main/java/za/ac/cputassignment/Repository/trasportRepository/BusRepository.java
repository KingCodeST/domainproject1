package za.ac.cputassignment.Repository.trasportRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.BusInfor;

import java.util.Set;

public interface BusRepository extends IRepository<Bus, String> {
    Set<Bus>getAll();
}
