package za.ac.cputassignment.service.transport.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;
import za.ac.cputassignment.Repository.transport.impl.DiskLicenseRepositoryImpl;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.Set;

@Service("serviceImpl")
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

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

