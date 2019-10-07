package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;

import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class DiskLicenseServiceImpl implements DiskLicenseService  {

    private static DiskLicenseService diskLicenseService= null;

    @Autowired
    private DiskLicenseRepository diskLicenseRepository;

    private DiskLicenseServiceImpl() {
    }

    public static DiskLicenseService getVehicleService(){
        if (diskLicenseService ==null) diskLicenseService=new DiskLicenseServiceImpl();
        return diskLicenseService;
    }

    @Override
    public DiskLicense retrieveByDesc(String vehicleDesc) {
        List<DiskLicense> campusLocations= getAll();
        for(DiskLicense campusRepository: campusLocations)
        {
            if (campusRepository.getCode().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<DiskLicense> getAll() {
        return this.diskLicenseRepository.findAll();
    }

    @Override
    public DiskLicense create(DiskLicense campusRepository) {

        return this.diskLicenseRepository.save(campusRepository);
    }

    @Override
    public DiskLicense read(String s) {
        Optional<DiskLicense> optVehicle =this.diskLicenseRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public DiskLicense update(DiskLicense campusRepository) {
        return this.diskLicenseRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.diskLicenseRepository.deleteById(s);
    }

}

