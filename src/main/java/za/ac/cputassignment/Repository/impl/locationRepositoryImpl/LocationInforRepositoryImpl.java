package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.domain.location.LocationInfor;

import java.util.HashSet;
import java.util.Set;

public class LocationInforRepositoryImpl implements LocationInforRepository {

    private static LocationInforRepositoryImpl repository=null;
    private Set<LocationInfor> locationInforSet;

    private LocationInforRepositoryImpl()
    {
        this.locationInforSet =new HashSet<>();
    }

    private LocationInfor findLocationInfor(String locationInforId)
    {
        return locationInforSet.stream()
                                .filter(locationInfor -> locationInfor.getId().trim().equals(locationInforId))
                                .findAny()
                                .orElse(null);
    }

    public static LocationInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new LocationInforRepositoryImpl();
        return repository;
    }



    @Override
    public LocationInfor create(LocationInfor locationInfor) {
        this.locationInforSet.add(locationInfor);
        return locationInfor;
    }

    @Override
    public LocationInfor read(String locainforId) {
        LocationInfor local=findLocationInfor(locainforId);

        return local;
    }

    @Override
    public LocationInfor update(LocationInfor locationInfor) {
        LocationInfor locationInfor1=findLocationInfor(locationInfor.getId());
        if(locationInfor1 !=null)
        {
            this.locationInforSet.remove(locationInfor1);
            return create(locationInfor);
        }
        return null;
    }

    @Override
    public void delete(String locaId) {
        LocationInfor locationInfor=findLocationInfor(locaId);
        if(locationInfor !=null)this.locationInforSet.remove(locationInfor);
    }



    @Override
    public Set<LocationInfor> getAll() {
        return this.locationInforSet;
    }


}
