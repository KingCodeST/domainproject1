package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableRepository;
import za.ac.cputassignment.domain.eventTrigger.Timetable;

import java.util.Set;

public class TimetableRepositoryImpl  implements TimetableRepository {

    private static TimetableRepositoryImpl repository =null;
    private Set<Timetable> timetables;

    private TimetableRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new TimetableRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Timetable> getAll() {
        return this.timetables;
    }

    @Override
    public Timetable create(Timetable timetable) {
        this.timetables.add(timetable);
        return timetable;
    }

    @Override
    public Timetable update(Timetable timetable) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Timetable read(String s) {
        return null;
    }
}
