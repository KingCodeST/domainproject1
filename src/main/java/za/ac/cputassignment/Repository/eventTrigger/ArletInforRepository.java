package za.ac.cputassignment.Repository.eventTrigger;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.Set;

public interface ArletInforRepository extends IRepository<ArletInfor,String> {
    Set<ArletInfor>getAll();
}
