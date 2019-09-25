package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SpecialLocationLRepository;
import za.ac.cputassignment.Repository.location.impl.SpecialLocationLRepositoryImpl;
import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.service.location.SpecialLocationLService;

import java.util.Set;

@Service("serviceImpl")
public class SpecialLocationLServiceImpl implements SpecialLocationLService {

    private static SpecialLocationLServiceImpl service=null;
    private SpecialLocationLRepository repository;

    private SpecialLocationLServiceImpl(){
        this.repository = SpecialLocationLRepositoryImpl.getRepository();
    }

    public static SpecialLocationLServiceImpl getService(){
        if(service ==null) service =new SpecialLocationLServiceImpl();
        return service;
    }



    @Override
    public Set<SpecialLocationL> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SpecialLocationL create(SpecialLocationL specialLocationL) {

        return this.repository.create(specialLocationL);
    }

    @Override
    public SpecialLocationL read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SpecialLocationL update(SpecialLocationL specialLocationL) {
        return this.repository.update(specialLocationL);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
