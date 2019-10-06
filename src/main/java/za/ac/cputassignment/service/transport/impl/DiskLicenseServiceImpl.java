package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;

import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.List;
import java.util.Set;


public class DiskLicenseServiceImpl implements DiskLicenseService  {


    @Override
    public DiskLicense retrieveByDesc(String diskLicenseDesc) {
        return null;
    }

    @Override
    public List<DiskLicense> getAll() {
        return null;
    }

    @Override
    public DiskLicense create(DiskLicense diskLicense) {
        return null;
    }

    @Override
    public DiskLicense read(String s) {
        return null;
    }

    @Override
    public DiskLicense update(DiskLicense diskLicense) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

