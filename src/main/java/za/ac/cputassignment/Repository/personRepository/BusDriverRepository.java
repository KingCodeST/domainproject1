package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.BusDriver;

import java.util.Set;

public interface BusDriverRepository extends IRepository<BusDriver , String> {
    Set<BusDriver> getAll();

}
