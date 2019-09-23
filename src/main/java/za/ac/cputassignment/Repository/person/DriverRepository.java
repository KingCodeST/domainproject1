package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.Set;

public interface DriverRepository extends IRepository<Driver,String> {
    Set<Driver>getAll();
}
