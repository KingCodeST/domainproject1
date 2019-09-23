package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.service.transport.DiskLicenseService;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class DiskLicenseRepositoryImpl implements DiskLicenseService {

    private static DiskLicenseRepositoryImpl repository = null;
    private Set<DiskLicense> diskLicenseSet;

    private DiskLicenseRepositoryImpl() {
        this.diskLicenseSet = new HashSet<>();
    }

    private DiskLicense FindStudentId(String busId) {
        return this.diskLicenseSet.stream()
                .filter(driverBus -> driverBus.getCode().trim().equals(busId))
                .findAny()
                .orElse(null);
    }

    public static DiskLicenseRepositoryImpl getRepository() {
        if (repository == null) repository = new DiskLicenseRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DiskLicense> getAll() {
        return this.diskLicenseSet;
    }

    @Override
    public DiskLicense create(DiskLicense diskLicenseObj) {
        this.diskLicenseSet.add(diskLicenseObj);
        return diskLicenseObj;
    }

    @Override
    public DiskLicense read(String residenceLocationID) {
        DiskLicense diskLicenseObj = FindStudentId(residenceLocationID);
        return diskLicenseObj;
    }

    @Override
    public DiskLicense update(DiskLicense diskLicenseObj) {
        DiskLicense toDelete = FindStudentId(diskLicenseObj.getCode());
        if (toDelete != null) {
            this.diskLicenseSet.remove(toDelete);
            return create(diskLicenseObj);
        }
        return null;
    }

    @Override
    public void delete(String busId) {
        DiskLicense diskLicenseObj = FindStudentId(busId);
        if (diskLicenseObj != null) this.diskLicenseSet.remove(diskLicenseObj);

    }
}