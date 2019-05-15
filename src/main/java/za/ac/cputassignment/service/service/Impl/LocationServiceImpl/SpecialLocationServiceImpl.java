package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.SpecialLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.service.LocationService.SpecialLocationService;

import java.util.Set;

@Service("ServiceImpl")
public class SpecialLocationServiceImpl implements SpecialLocationService {

    @Autowired
    @Qualifier
    private SpecialLocationRepository repository;

    private SpecialLocationServiceImpl()
    {
        this.repository = SpecialLocationRepositoryImpl.getRepository();
    }



    @Override
    public Set<SpecialLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        return this.repository.create(specialLocation);
    }

    @Override
    public SpecialLocation read(String s) {
        return this.read(s);
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
        return this.repository.update(specialLocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
