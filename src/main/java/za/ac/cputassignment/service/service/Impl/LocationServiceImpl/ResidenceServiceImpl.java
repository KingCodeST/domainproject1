package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.ResidenceRepositoryImpl;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.service.LocationService.ResidenceService;

import java.util.Set;

@Service
public class ResidenceServiceImpl implements ResidenceService {
    private static ResidenceServiceImpl service=null;
    private ResidenceRepository repository;

    private ResidenceServiceImpl()
    {
        this.repository = ResidenceRepositoryImpl.getRepository();

    }

    public static ResidenceServiceImpl getService()
    {
        if(service ==null) service =new ResidenceServiceImpl();
        return service;
    }

    @Override
    public Set<Residence> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Residence create(Residence residence) {
        return this.repository.create(residence);
    }

    @Override
    public Residence read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Residence update(Residence residence) {
        return this.repository.update(residence);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
