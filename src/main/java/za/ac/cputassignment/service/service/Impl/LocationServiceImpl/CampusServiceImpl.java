package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.CampusRepositoryImpl;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.service.LocationService.CampusService;

import java.util.Set;

@Service
public class CampusServiceImpl implements CampusService {

    private static CampusServiceImpl service=null;
    private CampusRepository campusRepository;

    private CampusServiceImpl()
    {
        this.campusRepository = CampusRepositoryImpl.getRepository();
    }

    public static CampusServiceImpl getService()
    {
        if(service==null) service=new CampusServiceImpl();
        return service;
    }

    @Override
    public Set<Campus> getAll() {
        return null;
    }

    @Override
    public Campus create(Campus campus) {
        return null;
    }

    @Override
    public Campus read(String s) {
        return null;
    }

    @Override
    public Campus update(Campus campus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
