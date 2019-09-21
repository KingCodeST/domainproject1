package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.Set;

public interface BusDriverRepository extends IRepository<Driver, String> {
    Set<Driver> getAll();

}
