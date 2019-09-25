package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceRepository;
import za.ac.cputassignment.Repository.location.impl.ResidenceRepositoryImpl;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.location.ResidenceService;

import java.util.Set;

@Service("serviceImpl")
public class ResidenceServiceImpl implements ResidenceService {


    private static ResidenceServiceImpl service=null;
    private ResidenceRepository repository;

    private ResidenceServiceImpl(){
        this.repository = ResidenceRepositoryImpl.getRepository();
    }

    public static ResidenceServiceImpl getService(){
        if(service ==null) service =new ResidenceServiceImpl();
        return service;
    }



    @Override
    public Set<Residence> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Residence create(Residence rlocation) {

        return this.repository.create(rlocation);
    }

    @Override
    public Residence read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Residence update(Residence rlocation) {
        return this.repository.update(rlocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
