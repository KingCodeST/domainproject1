package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface DriverLicenseService extends IService<DriverLicense,String> {
    DriverLicense retrieveByDesc(String driverDesc);
    List<DriverLicense> getAll();
}
