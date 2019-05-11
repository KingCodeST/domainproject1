package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

import java.util.HashSet;
import java.util.Set;

public class TimetableInforRepositoryImpl implements TimetableInforRepository {

    private static TimetableInforRepositoryImpl repository =null;
    private Set<TimetableInfo> timetableInfos;


    private  TimetableInforRepositoryImpl()
    {
        this.timetableInfos =new HashSet<>();
    }

    private TimetableInfo findTableinfo(String tId)
    {
        return this.timetableInfos.stream()
                   .filter(timetableInfo -> timetableInfo.getId().trim().equals(tId))
                    .findAny()
                    .orElse(null);
    }

    private TimetableInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new TimetableInforRepositoryImpl();
        return repository;
    }





    @Override
    public TimetableInfo create(TimetableInfo timetableInfo) {
        this.timetableInfos.add(timetableInfo);
        return timetableInfo;
    }

    @Override
    public TimetableInfo read(String s) {
        TimetableInfo timetableInfo =findTableinfo(s);
        return timetableInfo;
    }

    @Override
    public TimetableInfo update(TimetableInfo timetableInfo) {
       TimetableInfo timetableInfo1 =findTableinfo(timetableInfo.getId());
       if(timetableInfo1 !=null)
       {
           this.timetableInfos.remove(timetableInfo1);
           return create(timetableInfo);
       }
        return null;
    }

    @Override
    public void delete(String s) {
        TimetableInfo timetableInfo =findTableinfo(s);
        if(timetableInfo !=null) this.timetableInfos.remove(timetableInfo);

    }



    @Override
    public Set<TimetableInfo> getAll() {
        return timetableInfos;
    }

}
