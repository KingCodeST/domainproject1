package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SpecialLocationRepository;
import za.ac.cputassignment.Repository.location.impl.SpecialLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.location.SpecialLocationService;

import java.util.Set;

@Service("serviceImpl")
public class SpecialLocationServiceImpl implements SpecialLocationService {

    private static SpecialLocationServiceImpl service=null;
    private SpecialLocationRepository repository;

    private SpecialLocationServiceImpl(){
        this.repository = SpecialLocationRepositoryImpl.getRepository();
    }

    public static SpecialLocationServiceImpl getService(){
        if(service ==null) service =new SpecialLocationServiceImpl();
        return service;
    }



    @Override
    public Set<SpecialLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocationL) {

        return this.repository.create(specialLocationL);
    }

    @Override
    public SpecialLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocationL) {
        return this.repository.update(specialLocationL);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
