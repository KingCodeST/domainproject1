package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldLocationRepository;
import za.ac.cputassignment.Repository.location.impl.SportFieldLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.service.location.SportFieldLocationService;

import java.util.Set;

@Service("serviceImpl")
public class SportFieldLocationServiceImpl implements SportFieldLocationService {


    private static SportFieldLocationServiceImpl service=null;
    private SportFieldLocationRepository repository;

    private SportFieldLocationServiceImpl(){
        this.repository = SportFieldLocationRepositoryImpl.getRepository();
    }

    public static SportFieldLocationServiceImpl getService(){
        if(service ==null) service =new SportFieldLocationServiceImpl();
        return service;
    }



    @Override
    public Set<SportFieldLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SportFieldLocation create(SportFieldLocation sportFieldLocation) {

        return this.repository.create(sportFieldLocation);
    }

    @Override
    public SportFieldLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SportFieldLocation update(SportFieldLocation sportFieldLocation) {
        return this.repository.update(sportFieldLocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
