package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.HashSet;
import java.util.Set;

public class ArletInforRepositoryImpl implements ArletInforRepository {

    private static ArletInforRepositoryImpl repository=null;
    private Set<ArletInfor> arletInfors;


    private ArletInforRepositoryImpl()
    {
        this.arletInfors =new HashSet<>();
    }

    public  static ArletInforRepository getRepository()
    {
        if(repository == null) repository = new ArletInforRepositoryImpl();
        return repository;
    }

    @Override
    public Set<ArletInfor> getAll() {
        return this.arletInfors;
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {
       this.arletInfors.add(arletInfor);
        return arletInfor;
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public ArletInfor read(String s) {
        return null;
    }
}
