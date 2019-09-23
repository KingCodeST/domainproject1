package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.DriverLicenseRepository;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class DriverLicenseRepositoryImpl implements DriverLicenseRepository {


    private static DriverLicenseRepositoryImpl repository = null;
    private Set<DriverLicense> driverLicenseSet;

    private DriverLicenseRepositoryImpl() {
        this.driverLicenseSet = new HashSet<>();
    }

    private DriverLicense findArletInfor(String driverLicenseId) {
        return this.driverLicenseSet.stream()
                .filter(driverBus -> driverBus.getCode().trim().equals(driverLicenseId))
                .findAny()
                .orElse(null);
    }

    public static DriverLicenseRepositoryImpl getRepository() {
        if (repository == null) repository = new DriverLicenseRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DriverLicense> getAll() {
        return this.driverLicenseSet;
    }

    @Override
    public DriverLicense create(DriverLicense driverLicenseOb) {
        this.driverLicenseSet.add(driverLicenseOb);
        return driverLicenseOb;
    }

    @Override
    public DriverLicense read(String residenceLocationID) {
        DriverLicense driverLicenseOb = findArletInfor(residenceLocationID);
        return driverLicenseOb;
    }

    @Override
    public DriverLicense update(DriverLicense driverLicenseOb) {
        DriverLicense toDelete = findArletInfor(driverLicenseOb.getCode());
        if (toDelete != null) {
            this.driverLicenseSet.remove(toDelete);
            return create(driverLicenseOb);
        }
        return null;
    }

    @Override
    public void delete(String driverLicenseId) {
        DriverLicense driverLicenseOb = findArletInfor(driverLicenseId);
        if (driverLicenseOb != null) this.driverLicenseSet.remove(driverLicenseOb);

    }
}