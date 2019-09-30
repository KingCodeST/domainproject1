package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanRepository;
import za.ac.cputassignment.Repository.transport.impl.VanRepositoryImpl;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.transport.VanService;

import java.util.Set;


public class VanServiceImpl implements VanService {


    private static VanServiceImpl service=null;
    private VanRepository repository;

    private VanServiceImpl(){
        this.repository = (VanRepository) VanRepositoryImpl.getRepository();
    }

    public static VanServiceImpl getService(){
        if(service ==null) service =new VanServiceImpl();
        return service;
    }



    @Override
    public Set<Van> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Van create(Van objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Van read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Van update(Van objectEntity) {
        return this.repository.update(objectEntity);
    }

    public Van retrieveByDesc(String colors) {
        Set<Van> vans = getAll();
        for (Van van : vans) {
            if (van.getVanId().equalsIgnoreCase(colors)) return van;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

