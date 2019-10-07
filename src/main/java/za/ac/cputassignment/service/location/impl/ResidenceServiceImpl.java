package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceRepository;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.location.ResidenceService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class ResidenceServiceImpl implements ResidenceService {

    private static ResidenceService residenceService= null;

    @Autowired
    private ResidenceRepository residenceRepository;

    private ResidenceServiceImpl() {
    }

    public static ResidenceService getVehicleService(){
        if (residenceService ==null) residenceService=new ResidenceServiceImpl();
        return residenceService;
    }

    @Override
    public Residence retrieveByDesc(String vehicleDesc) {
        List<Residence> campusLocations= getAll();
        for(Residence campusRepository: campusLocations)
        {
            if (campusRepository.getAddress().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Residence> getAll() {
        return this.residenceRepository.findAll();
    }

    @Override
    public Residence create(Residence campusRepository) {

        return this.residenceRepository.save(campusRepository);
    }

    @Override
    public Residence read(String s) {
        Optional<Residence> optVehicle =this.residenceRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Residence update(Residence campusRepository) {
        return this.residenceRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.residenceRepository.deleteById(s);
    }

}
