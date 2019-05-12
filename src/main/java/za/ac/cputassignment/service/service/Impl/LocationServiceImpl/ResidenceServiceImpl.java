package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.service.LocationService.ResidenceService;

import java.util.Set;

@Service
public class ResidenceServiceImpl implements ResidenceService {
    private static ResidenceServiceImpl service=null;
    private ResidenceRepository repository;
    @Override
    public Set<Residence> getAll() {
        return null;
    }

    @Override
    public Residence create(Residence residence) {
        return null;
    }

    @Override
    public Residence read(String s) {
        return null;
    }

    @Override
    public Residence update(Residence residence) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
