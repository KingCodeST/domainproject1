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

    private ArletInfor findArlet(String arletId)
    {
        return arletInfors.stream()
                .filter(arletInfor -> arletInfor.getId().trim().equals(arletId))
                .findAny()
                .orElse(null);
    }

    public  static ArletInforRepository getRepository()
    {
        if(repository == null) repository = new ArletInforRepositoryImpl();
        return repository;
    }



    @Override
    public ArletInfor create(ArletInfor arletInfor) {
       this.arletInfors.add(arletInfor);
        return arletInfor;
    }

    @Override
    public ArletInfor read(String arlteId) {
        ArletInfor arletInfor=findArlet(arlteId);
        return arletInfor;
    }


    @Override
    public ArletInfor update(ArletInfor arletInfor) {
       ArletInfor arletInfor1 =findArlet(arletInfor.getId());
       if(arletInfor1 !=null)
       {
           this.arletInfors.remove(arletInfor1);
           return create(arletInfor);
       }
        return null;
    }

    @Override
    public void delete(String arletId) {
        ArletInfor arletInfor=findArlet(arletId);
        if(arletInfor !=null) this.arletInfors.remove(arletInfor);
    }


    @Override
    public Set<ArletInfor> getAll() {
        return this.arletInfors;
    }
}
