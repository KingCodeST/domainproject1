package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.CampusLocationRepository;
import za.ac.cputassignment.Repository.location.impl.CampusLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.location.CampusLocationService;

import java.util.Set;


public class CampusLocationServiceImpl implements CampusLocationService {


    private static CampusLocationServiceImpl service=null;
    private CampusLocationRepository repository;

    private CampusLocationServiceImpl(){
        this.repository = CampusLocationRepositoryImpl.getRepository();
    }

    public static CampusLocationServiceImpl getService(){
        if(service ==null) service =new CampusLocationServiceImpl();
        return service;
    }



    @Override
    public Set<CampusLocation> getAll() {
        return this.repository.getAll();
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {

        return this.repository.create(campusLocation);
    }

    @Override
    public CampusLocation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        return this.repository.update(campusLocation);
    }

    public CampusLocation retrieveByDesc(String colors) {
        Set<CampusLocation> campusLocations = getAll();
        for (CampusLocation campusLocation : campusLocations) {
            if (campusLocation.getAddress().equalsIgnoreCase(colors)) return campusLocation;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}