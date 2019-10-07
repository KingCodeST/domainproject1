package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import za.ac.cputassignment.Repository.location.CampusRepository;

import za.ac.cputassignment.domain.location.Campus;

import za.ac.cputassignment.service.location.CampusService;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@ComponentScan

public class CampusServiceImpl implements CampusService{

    @Autowired
    private static CampusService campusService= null;
    private CampusRepository campusLocationRepository;

    private CampusServiceImpl() {
    }

    public static CampusService getVehicleService(){
        if (campusService ==null) campusService=new CampusServiceImpl();
        return campusService;
    }

//    @Override
//    public Campus retrieveByDesc(String vehicleDesc) {
//        List<Campus> campusLocations= getAll();
//        for(Campus campusRepository: campusLocations)
//        {
//            if (campusRepository.getName().equalsIgnoreCase(vehicleDesc))
//                return  campusRepository;
//        }
//        return null;
//    }

    @Override
    public Set<Campus> getAll() {
        Set<Campus> campuses=new HashSet<>();
        campuses.addAll(this.campusLocationRepository.findAll());
        return campuses;
    }

    @Override
    public Campus create(Campus campusRepository) {

        return this.campusLocationRepository.save(campusRepository);
    }

    @Override
    public Campus read(String s) {
        Optional<Campus> optVehicle =this.campusLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Campus update(Campus campusRepository) {
        return this.campusLocationRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.campusLocationRepository.deleteById(s);
    }
}