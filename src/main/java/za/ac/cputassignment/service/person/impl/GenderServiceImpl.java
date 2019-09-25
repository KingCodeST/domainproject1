package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.GenderRepository;
import za.ac.cputassignment.Repository.person.impl.GenderRepositoryImpl;
import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.service.person.GenderService;

import java.util.Set;

@Service("serviceImpl")
public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service=null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService(){
        if(service ==null) service =new GenderServiceImpl();
        return service;
    }



    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Gender create(Gender objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Gender update(Gender objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

