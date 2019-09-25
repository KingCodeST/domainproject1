package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverBusRepository;
import za.ac.cputassignment.Repository.person.impl.DriverBusRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.person.DriverBusService;

import java.util.Set;

@Service("serviceImpl")
public class DriverBusServiceImpl implements DriverBusService {


    private static DriverBusServiceImpl service=null;
    private DriverBusRepository repository;

    private DriverBusServiceImpl(){
        this.repository = DriverBusRepositoryImpl.getRepository();
    }

    public static DriverBusServiceImpl getService(){
        if(service ==null) service =new DriverBusServiceImpl();
        return service;
    }



    @Override
    public Set<DriverBus> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DriverBus create(DriverBus objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public DriverBus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DriverBus update(DriverBus objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
