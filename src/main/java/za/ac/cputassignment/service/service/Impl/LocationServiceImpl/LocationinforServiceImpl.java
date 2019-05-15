package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.LocationInforRepositoryImpl;
import za.ac.cputassignment.domain.location.LocationInfor;
import za.ac.cputassignment.service.service.LocationService.LocationInforService;

import java.util.Set;

@Service("ServiceImpl")
public class LocationinforServiceImpl implements LocationInforService {


    @Autowired
    @Qualifier
    private LocationInforRepository repository;

    private LocationinforServiceImpl()
    {
        this.repository = LocationInforRepositoryImpl.getRepository();
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
