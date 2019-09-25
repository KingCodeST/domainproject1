package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.RaceRepository;
import za.ac.cputassignment.Repository.person.impl.RaceRepositoryImpl;
import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.service.person.RaceService;

import java.util.Set;

@Service("serviceImpl")
public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl service=null;
    private RaceRepository repository;

    private RaceServiceImpl(){
        this.repository = RaceRepositoryImpl.getRepository();
    }

    public static RaceServiceImpl getService(){
        if(service ==null) service =new RaceServiceImpl();
        return service;
    }



    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

