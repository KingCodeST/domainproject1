package za.ac.cputassignment.service.transport.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.Set;

@Service("serviceImpl")
public class DiskLicenseServiceImpl implements DiskLicenseService {


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
