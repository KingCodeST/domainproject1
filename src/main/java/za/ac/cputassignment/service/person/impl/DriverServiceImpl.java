package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.Repository.person.impl.DriverRepositoryImpl;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.person.DriverService;

import java.util.Set;

@Service("serviceImpl")
public class DriverServiceImpl implements DriverService {

    private static DriverServiceImpl service=null;
    private DriverRepository repository;

    private DriverServiceImpl(){
        this.repository = DriverRepositoryImpl.getRepository();
    }

    public static DriverServiceImpl getService(){
        if(service ==null) service =new DriverServiceImpl();
        return service;
    }



    @Override
    public Set<Driver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Driver create(Driver objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Driver read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Driver update(Driver objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

