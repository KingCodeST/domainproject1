package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.SpecialLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.service.LocationService.SpecialLocationService;

import java.util.Set;

@Service
public class SpecialLocationServiceImpl implements SpecialLocationService {

    private static SpecialLocationServiceImpl service=null;
    private SpecialLocationRepository repository;

    private SpecialLocationServiceImpl()
    {
        this.repository = SpecialLocationRepositoryImpl.getRepository();
    }

    public static SpecialLocationServiceImpl getService()
    {
        if(service== null) service =new SpecialLocationServiceImpl();
        return  service;
    }


    @Override
    public Set<SpecialLocation> getAll() {
        return null;
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        return null;
    }

    @Override
    public SpecialLocation read(String s) {
        return null;
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
