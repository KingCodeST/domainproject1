package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.DriverBus;

import java.util.Set;

public interface DriverInforRepository extends IRepository <DriverBus, String>
{

    Set<DriverBus> getAll();

}
