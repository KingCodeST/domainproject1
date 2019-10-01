package za.ac.cputassignment.service.eventTrigger.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;
import za.ac.cputassignment.Repository.eventTrigger.impl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;

import java.util.Set;

@Service("ServiceArletInforImpl")
public class ArletInforServiceImpl implements ArletInforService {

    @Autowired
    @Qualifier("InMemory")
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


    public ArletInfor retrieveByDesc(String colors) {
        Set<ArletInfor> arletInfors = getAll();
        for (ArletInfor arletInfor : arletInfors) {
            if (arletInfor.getBlue().equalsIgnoreCase(colors)) return arletInfor;
        }
        return null;
    }
    

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
