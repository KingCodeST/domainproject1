package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.LocationInforRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.LocationInforRepositoryImpl;
import za.ac.cputassignment.domain.location.CampusLocation;
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
    public Set<CampusLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {
        return this.repository.create(campusLocation);
    }

    @Override
    public CampusLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        return this.repository.update(campusLocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
