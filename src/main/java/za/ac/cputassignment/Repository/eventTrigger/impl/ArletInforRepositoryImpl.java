package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class ArletInforRepositoryImpl implements ArletInforRepository {

    private static ArletInforRepositoryImpl repository =null;
    private Set<ArletInfor> arletInfors;

    private ArletInforRepositoryImpl(){
        this.arletInfors =new HashSet<>();
    }

    private ArletInfor findArletInfor(String arletId)
    {
        return this.arletInfors.stream()
                                .filter(arletInfor -> arletInfor.getAlertInforId().trim().equals(arletId))
                                .findAny()
                                .orElse(null);
    }

    public static ArletInforRepositoryImpl getRepository(){
        if(repository ==null) repository=new ArletInforRepositoryImpl();
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
    public ArletInfor read(String alertInforId) {
        ArletInfor arletInfor=findArletInfor(alertInforId);
        return arletInfor;
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        ArletInfor toDelete =findArletInfor(arletInfor.getAlertInforId());
        if(toDelete !=null)
        {
            this.arletInfors.remove(toDelete);
            return create(arletInfor);
        }
        return null;
    }

    @Override
    public void delete(String alertInforId) {
        ArletInfor arletInfor=findArletInfor(alertInforId);
        if (arletInfor !=null) this.arletInfors.remove(arletInfor);

    }
}
