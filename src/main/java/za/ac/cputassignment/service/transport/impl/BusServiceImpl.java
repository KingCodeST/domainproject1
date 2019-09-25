package za.ac.cputassignment.service.transport.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusRepository;
import za.ac.cputassignment.Repository.transport.impl.BusRepositoryImpl;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;
import za.ac.cputassignment.service.transport.BusService;

import java.util.Set;

@Service("serviceImpl")
public class BusServiceImpl implements BusService {


    private static BusServiceImpl service=null;
    private BusRepositoryImpl repository;

    private BusServiceImpl(){
        this.repository = BusRepositoryImpl.getRepository();
    }

    public static BusServiceImpl getService(){
        if(service ==null) service =new BusServiceImpl();
        return service;
    }



    @Override
    public Set<Bus> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Bus create(Bus objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Bus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Bus update(Bus objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

