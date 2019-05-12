package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.SportFieldRepositoryImpl;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.service.LocationService.SportFieldService;

import java.util.Set;

@Service
public class SportFieldServiceImpl implements SportFieldService {

    private static SportFieldServiceImpl service =null;
    private SportFieldRepository repository;

    private SportFieldServiceImpl()
    {
        this.repository =SportFieldRepositoryImpl.getRepository();
    }

    public static SportFieldServiceImpl getService()
    {
        if(service ==null) service =new SportFieldServiceImpl();
        return  service;
    }


    @Override
    public Set<SportField> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SportField create(SportField sportField) {
        return this.repository.create(sportField);
    }

    @Override
    public SportField read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SportField update(SportField sportField) {
        return this.repository.update(sportField);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
