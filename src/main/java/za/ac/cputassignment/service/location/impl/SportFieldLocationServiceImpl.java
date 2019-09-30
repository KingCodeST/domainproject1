package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldLocationRepository;
import za.ac.cputassignment.Repository.location.impl.SportFieldLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.service.location.SportFieldLocationService;

import java.util.Set;


public class SportFieldLocationServiceImpl implements SportFieldLocationService {



    private static SportFieldLocationServiceImpl service=null;
    private SportFieldLocationRepository repository;

    private SportFieldLocationServiceImpl(){
        this.repository = SportFieldLocationRepositoryImpl.getRepository();
    }

    public static SportFieldLocationServiceImpl getService(){
        if(service ==null) service =new SportFieldLocationServiceImpl();
        return service;
    }



    @Override
    public Set<SportFieldLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SportFieldLocation create(SportFieldLocation sportFieldLocation) {

        return this.repository.create(sportFieldLocation);
    }

    @Override
    public SportFieldLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SportFieldLocation update(SportFieldLocation sportFieldLocation) {
        return this.repository.update(sportFieldLocation);
    }

    public SportFieldLocation retrieveByDesc(String colors) {
        Set<SportFieldLocation> splfs = getAll();
        for (SportFieldLocation splf : splfs) {
            if (splf.getAddress().equalsIgnoreCase(colors)) return splf;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
