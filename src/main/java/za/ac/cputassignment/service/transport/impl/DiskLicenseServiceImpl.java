package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;
import za.ac.cputassignment.Repository.transport.impl.DiskLicenseRepositoryImpl;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.Set;


public class DiskLicenseServiceImpl implements DiskLicenseService {


    private static DiskLicenseServiceImpl service=null;
    private DiskLicenseRepositoryImpl repository;

    private DiskLicenseServiceImpl(){
        this.repository = DiskLicenseRepositoryImpl.getRepository();
    }

    public static DiskLicenseServiceImpl getService(){
        if(service ==null) service =new DiskLicenseServiceImpl();
        return service;
    }



    @Override
    public Set<DiskLicense> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DiskLicense create(DiskLicense objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public DiskLicense read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DiskLicense update(DiskLicense objectEntity) {
        return this.repository.update(objectEntity);
    }

    public DiskLicense retrieveByDesc(String colors) {
        Set<DiskLicense> diskLicense = getAll();
        for (DiskLicense diskLicenses : diskLicense) {
            if (diskLicenses.getCode().equalsIgnoreCase(colors)) return diskLicenses;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

