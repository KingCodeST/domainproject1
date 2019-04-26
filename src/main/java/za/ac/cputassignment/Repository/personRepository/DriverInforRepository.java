package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.DriverInfor;

import java.util.Set;

public interface DriverInforRepository extends IRepository <DriverInfor, String>
{

    Set<DriverInfor >getAll();

}
