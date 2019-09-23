package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class RideStatusRepositoryImpl implements RideStatusRepository {

    private static RideStatusRepositoryImpl repository =null;
    private Set<RideStatus> arletInfors;

    private RideStatusRepositoryImpl(){
        this.arletInfors =new HashSet<>();
    }

    private RideStatus findArletInfor(String arletId)
    {
        return this.arletInfors.stream()
                .filter(arletInfor -> arletInfor.getRideStatusId().trim().equals(arletId))
                .findAny()
                .orElse(null);
    }

    public static RideStatusRepositoryImpl getRepository(){
        if(repository ==null) repository=new RideStatusRepositoryImpl();
        return repository;
    }

    @Override
    public Set<RideStatus> getAll() {
        return this.arletInfors;
    }

    @Override
    public RideStatus create(RideStatus arletInfor) {
        this.arletInfors.add(arletInfor);
        return arletInfor;
    }

    @Override
    public RideStatus read(String alertInforId) {
        RideStatus arletInfor=findArletInfor(alertInforId);
        return arletInfor;
    }

    @Override
    public RideStatus update(RideStatus arletInfor) {
        RideStatus toDelete =findArletInfor(arletInfor.getRideStatusId());
        if(toDelete !=null)
        {
            this.arletInfors.remove(toDelete);
            return create(arletInfor);
        }
        return null;
    }

    @Override
    public void delete(String alertInforId) {
        RideStatus arletInfor=findArletInfor(alertInforId);
        if (arletInfor !=null) this.arletInfors.remove(arletInfor);

    }
}
