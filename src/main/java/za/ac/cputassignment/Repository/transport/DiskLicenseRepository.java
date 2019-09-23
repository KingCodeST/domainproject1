package za.ac.cputassignment.Repository.transport;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.util.Set;

public interface DiskLicenseRepository extends IRepository<DiskLicense,String> {
    Set<DiskLicense>getAll();
}
