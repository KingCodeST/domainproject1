package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.CampusLocationRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class CampusLocationRepositoryImpl implements CampusLocationRepository {
    
    private static CampusLocationRepositoryImpl repository =null;
    private Set<CampusLocation> arletInfors;

    private CampusLocationRepositoryImpl(){
        this.arletInfors =new HashSet<>();
    }

    private CampusLocation findArletInfor(String arletId)
    {
        return this.arletInfors.stream()
                .filter(arletInfor -> arletInfor.getCampusLocationId().trim().equals(arletId))
                .findAny()
                .orElse(null);
    }

    public static CampusLocationRepositoryImpl getRepository(){
        if(repository ==null) repository=new CampusLocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CampusLocation> getAll() {
        return this.arletInfors;
    }

    @Override
    public CampusLocation create(CampusLocation arletInfor) {
        this.arletInfors.add(arletInfor);
        return arletInfor;
    }

    @Override
    public CampusLocation read(String alertInforId) {
        CampusLocation arletInfor=findArletInfor(alertInforId);
        return arletInfor;
    }

    @Override
    public CampusLocation update(CampusLocation arletInfor) {
        CampusLocation toDelete =findArletInfor(arletInfor.getCampusLocationId());
        if(toDelete !=null)
        {
            this.arletInfors.remove(toDelete);
            return create(arletInfor);
        }
        return null;
    }

    @Override
    public void delete(String alertInforId) {
        CampusLocation arletInfor=findArletInfor(alertInforId);
        if (arletInfor !=null) this.arletInfors.remove(arletInfor);

    }
}
