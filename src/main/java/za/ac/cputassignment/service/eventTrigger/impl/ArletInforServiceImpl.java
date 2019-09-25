package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;
import za.ac.cputassignment.Repository.eventTrigger.impl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;

import java.util.Set;

@Service("serviceImpl")
public class ArletInforServiceImpl implements ArletInforService {

    private static ArletInforServiceImpl service=null;
    private ArletInforRepository repository;

    private ArletInforServiceImpl(){
        this.repository = ArletInforRepositoryImpl.getRepository();
    }

    public static ArletInforServiceImpl getService(){
        if(service ==null) service =new ArletInforServiceImpl();
        return service;
    }



    @Override
    public Set<ArletInfor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {

        return this.repository.create(arletInfor);
    }

    @Override
    public ArletInfor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return this.repository.update(arletInfor);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
