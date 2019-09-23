package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.Set;

@Repository("InMemory")
public class DiskLicenseRepositoryImpl implements DiskLicenseService {
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
