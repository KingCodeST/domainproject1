package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.*;

@Repository("InMemory")
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
    public Set<ArletInfor> getAll() {
        return null;
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public ArletInfor read(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return null;
    }


}
