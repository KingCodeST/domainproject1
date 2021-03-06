package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface DiskLicenseService extends IService<DiskLicense,String> {
    DiskLicense retrieveByDesc(String diskLicenseDesc);
    List<DiskLicense> getAll();
}
