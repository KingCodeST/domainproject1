package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.LocationInforRepositoryImpl;
import za.ac.cputassignment.domain.location.LocationInfor;
import za.ac.cputassignment.service.service.LocationService.LocationInforService;

import java.util.Set;

@Service
public class LocationinforServiceImpl implements LocationInforService {

    private static LocationinforServiceImpl service =null;
    private LocationInforRepository repository;

    private LocationinforServiceImpl()
    {
        this.repository = LocationInforRepositoryImpl.getRepository();
    }

    public static  LocationinforServiceImpl getService()
    {
        if(service ==null) service =LocationinforServiceImpl.getService();
        return service;
    }

    @Override
    public Set<LocationInfor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public LocationInfor create(LocationInfor locationInfor) {
        return this.repository.create(locationInfor);
    }

    @Override
    public LocationInfor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public LocationInfor update(LocationInfor locationInfor) {
        return this.repository.update(locationInfor);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
