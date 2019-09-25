package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldRepository;
import za.ac.cputassignment.Repository.location.impl.SportFieldRepositoryImpl;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.location.SportFieldService;

import java.util.Set;

@Service("serviceImpl")
public class SportFieldServiceImpl implements SportFieldService {


    private static SportFieldServiceImpl service=null;
    private SportFieldRepository repository;

    private SportFieldServiceImpl(){
        this.repository = SportFieldRepositoryImpl.getRepository();
    }

    public static SportFieldServiceImpl getService(){
        if(service ==null) service =new SportFieldServiceImpl();
        return service;
    }



    @Override
    public Set<SportField> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SportField create(SportField sportFieldLocation) {

        return this.repository.create(sportFieldLocation);
    }

    @Override
    public SportField read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SportField update(SportField sportFieldLocation) {
        return this.repository.update(sportFieldLocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
