package za.ac.cputassignment.Repository.eventTriggerRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

import java.util.Set;

public interface TimetableInforRepository extends IRepository<TimetableInfo,String> {
    Set<TimetableInfo>getAll();
}
