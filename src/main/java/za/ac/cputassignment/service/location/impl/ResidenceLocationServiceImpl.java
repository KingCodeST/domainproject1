package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceLocationRepository;
import za.ac.cputassignment.Repository.location.impl.ResidenceLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.service.location.ResidenceLocationService;

import java.util.Set;

@Service("serviceImpl")
public class ResidenceLocationServiceImpl implements ResidenceLocationService {


    private static ResidenceLocationServiceImpl service=null;
    private ResidenceLocationRepository repository;

    private ResidenceLocationServiceImpl(){
        this.repository = ResidenceLocationRepositoryImpl.getRepository();
    }

    public static ResidenceLocationServiceImpl getService(){
        if(service ==null) service =new ResidenceLocationServiceImpl();
        return service;
    }



    @Override
    public Set<ResidenceLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ResidenceLocation create(ResidenceLocation rlocation) {

        return this.repository.create(rlocation);
    }

    @Override
    public ResidenceLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ResidenceLocation update(ResidenceLocation rlocation) {
        return this.repository.update(rlocation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
