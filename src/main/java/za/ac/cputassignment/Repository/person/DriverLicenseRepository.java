package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.DriverLicense;

import java.util.Set;

public interface DriverLicenseRepository extends IRepository<DriverLicense,String> {
    Set<DriverLicense>getAll();
}
