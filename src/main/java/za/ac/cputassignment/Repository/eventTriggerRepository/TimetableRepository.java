package za.ac.cputassignment.Repository.eventTriggerRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.eventTrigger.Timetable;

import java.util.Set;

public interface TimetableRepository extends IRepository<Timetable,String> {
    Set<Timetable>getAll();
}
