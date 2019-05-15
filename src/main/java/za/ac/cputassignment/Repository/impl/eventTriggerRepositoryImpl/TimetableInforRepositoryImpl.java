package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

import java.util.*;
@Repository("InMemory")
public class TimetableInforRepositoryImpl implements TimetableInforRepository {

    private static TimetableInforRepositoryImpl repository =null;
    private Map<String,TimetableInfo> timetableInfos;


    private  TimetableInforRepositoryImpl()
    {
        this.timetableInfos =new HashMap<>();
    }



    public static TimetableInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new TimetableInforRepositoryImpl();
        return repository;
    }





    @Override
    public TimetableInfo create(TimetableInfo timetableInfo) {
        this.timetableInfos.put(timetableInfo.getId(),timetableInfo);
        return timetableInfo;
    }

    @Override
    public TimetableInfo read(String s) {
       return this.timetableInfos.get(s);
    }

    @Override
    public TimetableInfo update(TimetableInfo timetableInfo) {
      this.timetableInfos.replace(timetableInfo.getId(),timetableInfo);
      return this.timetableInfos.get(timetableInfo.getId());
    }

    @Override
    public void delete(String id) {
        this.timetableInfos.remove(id);
    }



    @Override
    public Set<TimetableInfo> getAll() {
        Collection<TimetableInfo> timetableInfos=this.timetableInfos.values();
        Set<TimetableInfo> set =new HashSet<>();
        set.addAll(timetableInfos);
        return set;
    }

}
