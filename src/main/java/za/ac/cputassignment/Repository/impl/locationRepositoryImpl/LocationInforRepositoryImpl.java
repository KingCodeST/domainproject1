package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.domain.location.LocationInfor;

import java.util.*;
@Repository("InMemory")
public class LocationInforRepositoryImpl implements LocationInforRepository {

    private static LocationInforRepositoryImpl repository=null;
    private Map<String,LocationInfor> locationInforSet;

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
    public LocationInfor create(LocationInfor locationInfor) {
        this.locationInforSet.put(locationInfor.getId(),locationInfor);
        return locationInfor;
    }

    @Override
    public LocationInfor read(String locainforId) {
        return this.locationInforSet.get(locainforId);
    }

    @Override
    public LocationInfor update(LocationInfor locationInfor) {
       this.locationInforSet.replace(locationInfor.getId(),locationInfor);
       return this.locationInforSet.get(locationInfor.getId());
    }

    @Override
    public void delete(String locaId) {
       this.locationInforSet.remove(locaId);
    }



    @Override
    public Set<LocationInfor> getAll() {
        Collection<LocationInfor> locationInfors =this.locationInforSet.values();
        Set<LocationInfor> set =new HashSet<>();
        set.addAll(locationInfors);
        return set;
    }


}
