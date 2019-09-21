package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.*;
@Repository("InMemory")
public class LocationInforRepositoryImpl implements LocationInforRepository {

    private static LocationInforRepositoryImpl repository=null;
    private Map<String, CampusLocation> locationInforSet;

    private LocationInforRepositoryImpl()
    {
        this.locationInforSet =new HashMap<>();
    }




    public static LocationInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new LocationInforRepositoryImpl();
        return repository;
    }



    @Override
    public CampusLocation create(CampusLocation campusLocation) {
        this.locationInforSet.put(campusLocation.getCampusLocationId(), campusLocation);
        return campusLocation;
    }

    @Override
    public CampusLocation read(String locainforId) {
        return this.locationInforSet.get(locainforId);
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
       this.locationInforSet.replace(campusLocation.getCampusLocationId(), campusLocation);
       return this.locationInforSet.get(campusLocation.getCampusLocationId());
    }

    @Override
    public void delete(String locaId) {
       this.locationInforSet.remove(locaId);
    }



    @Override
    public Set<CampusLocation> getAll() {
        Collection<CampusLocation> campusLocations =this.locationInforSet.values();
        Set<CampusLocation> set =new HashSet<>();
        set.addAll(campusLocations);
        return set;
    }


}
