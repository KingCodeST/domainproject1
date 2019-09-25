package za.ac.cputassignment.service.transport.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusInforRepository;
import za.ac.cputassignment.Repository.transport.impl.BusInforRepositoryImpl;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;

import java.util.Set;

@Service("serviceImpl")
public class BusInforServiceImpl implements BusInforService {

    private static BusInforServiceImpl service=null;
    private BusInforRepositoryImpl repository;

    private BusInforServiceImpl(){
        this.repository = BusInforRepositoryImpl.getRepository();
    }

    public static BusInforServiceImpl getService(){
        if(service ==null) service =new BusInforServiceImpl();
        return service;
    }



    @Override
    public Set<BusInfor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public BusInfor create(BusInfor objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public BusInfor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public BusInfor update(BusInfor objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

