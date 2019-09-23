package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.DriverBus;

import java.util.Set;

public interface DriverBusRepository extends IRepository<DriverBus,String> {
    Set<DriverBus>getAll();
}
