package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class DriverLicenseRepositoryImpl implements DiskLicenseRepository {


    @Override
    public Set<DiskLicense> getAll() {
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