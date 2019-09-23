package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class RideRepositoryImpl implements RideRepository {
    
    private static RideRepositoryImpl repository =null;
    private Set<Ride> arletInfors;

    private RideRepositoryImpl(){
        this.arletInfors =new HashSet<>();
    }

    private Ride findArletInfor(String arletId)
    {
        return this.arletInfors.stream()
                .filter(arletInfor -> arletInfor.getRideNumber().trim().equals(arletId))
                .findAny()
                .orElse(null);
    }

    public static RideRepositoryImpl getRepository(){
        if(repository ==null) repository=new RideRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Ride> getAll() {
        return this.arletInfors;
    }

    @Override
    public Ride create(Ride arletInfor) {
        this.arletInfors.add(arletInfor);
        return arletInfor;
    }

    @Override
    public Ride read(String alertInforId) {
        Ride arletInfor=findArletInfor(alertInforId);
        return arletInfor;
    }

    @Override
    public Ride update(Ride arletInfor) {
        Ride toDelete =findArletInfor(arletInfor.getRideNumber());
        if(toDelete !=null)
        {
            this.arletInfors.remove(toDelete);
            return create(arletInfor);
        }
        return null;
    }

    @Override
    public void delete(String alertInforId) {
        Ride arletInfor=findArletInfor(alertInforId);
        if (arletInfor !=null) this.arletInfors.remove(arletInfor);

    }
}
