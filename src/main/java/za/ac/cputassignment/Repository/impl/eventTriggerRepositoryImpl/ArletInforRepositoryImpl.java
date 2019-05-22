package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.*;

@Repository()
public class ArletInforRepositoryImpl implements ArletInforRepository {

    private static ArletInforRepositoryImpl repository=null;
    private Map<String, ArletInfor> arletInfors;


    private ArletInforRepositoryImpl()
    {
        this.arletInfors =new HashMap<>();
    }



    public  static ArletInforRepository getRepository()
    {
        if(repository == null) repository = new ArletInforRepositoryImpl();
        return repository;
    }



    @Override
    public ArletInfor create(ArletInfor arletInfor) {
       this.arletInfors.put(arletInfor.getId(),arletInfor);
        return arletInfor;
    }

    @Override
    public ArletInfor read(String arlteId) {

        return this.arletInfors.get(arlteId);
    }


    @Override
    public ArletInfor update(ArletInfor arletInfor) {
       this.arletInfors.replace(arletInfor.getId(),arletInfor);
       return this.arletInfors.get(arletInfor.getId());
    }

    @Override
    public void delete(String arletId) {
        this.arletInfors.remove(arletId);
    }


    @Override
    public Set<ArletInfor> getAll() {
        Collection<ArletInfor> arletInfors =this.arletInfors.values();
        Set<ArletInfor> set =new HashSet<>();
        set.addAll(arletInfors);
        return set;
    }
}
