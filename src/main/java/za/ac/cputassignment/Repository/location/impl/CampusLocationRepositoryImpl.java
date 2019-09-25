package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.CampusLocationRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class CampusLocationRepositoryImpl implements CampusLocationRepository {
    
    private static CampusLocationRepositoryImpl repository =null;
    private Set<CampusLocation> campusLocationSet;

    private CampusLocationRepositoryImpl(){
        this.campusLocationSet =new HashSet<>();
    }

    private CampusLocation findArletInfor(String campusLocationId)
    {
        return this.campusLocationSet.stream()
                .filter(campusLocation -> campusLocation.getCampusLocationId().trim().equals(campusLocationId))
                .findAny()
                .orElse(null);
    }

    public static CampusLocationRepositoryImpl getRepository(){
        if(repository ==null) repository=new CampusLocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CampusLocation> getAll() {
        return this.campusLocationSet;
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {
        this.campusLocationSet.add(campusLocation);
        return campusLocation;
    }

    @Override
    public CampusLocation read(String campusLocationId) {
        CampusLocation campusLocation=findArletInfor(campusLocationId);
        return campusLocation;
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        CampusLocation toDelete =findArletInfor(campusLocation.getCampusLocationId());
        if(toDelete !=null)
        {
            this.campusLocationSet.remove(toDelete);
            return create(campusLocation);
        }
        return null;
    }

    @Override
    public void delete(String campusLocationId) {
        CampusLocation campusLocation=findArletInfor(campusLocationId);
        if (campusLocation !=null) this.campusLocationSet.remove(campusLocation);

    }
}
