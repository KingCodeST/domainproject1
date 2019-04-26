package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

import java.util.Set;

public class TimetableInforRepositoryImpl implements TimetableInforRepository {

    private static TimetableRepositoryImpl repository =null;
    private Set<TimetableInfo> timetableInfos;


    private TimetableRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new TimetableRepositoryImpl();
        return repository;
    }



    @Override
    public Set<TimetableInfo> getAll() {
        return timetableInfos;
    }

    @Override
    public TimetableInfo create(TimetableInfo timetableInfo) {
        this.timetableInfos.add(timetableInfo);
        return timetableInfo;
    }

    @Override
    public TimetableInfo update(TimetableInfo timetableInfo) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public TimetableInfo read(String s) {
        return null;
    }
}
