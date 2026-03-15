package za.ac.cputassignment.service.person.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.person.DriverService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    private static final Logger logger = LoggerFactory.getLogger(DriverServiceImpl.class);

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver retrieveByDesc(String licenseCode) {
        logger.debug("Retrieving driver by license code: {}", licenseCode);
        Optional<Driver> driver = driverRepository.findByLicenseCode(licenseCode);
        if (driver.isEmpty()) {
            logger.warn("Driver not found with license code: {}", licenseCode);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Driver not found with license code: " + licenseCode
            );
        }
        return driver.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Driver> getAll() {
        logger.debug("Fetching all drivers");
        return driverRepository.findAll();
    }

    @Override
    public Driver create(Driver driver) {
        if (driver == null) {
            logger.error("Cannot create null driver");
            throw new IllegalArgumentException("Driver cannot be null");
        }
        logger.info("Creating new driver: {}", driver.getDriverID());
        return driverRepository.save(driver);
    }

    @Override
    @Transactional(readOnly = true)
    public Driver read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Driver ID cannot be null or empty");
            throw new IllegalArgumentException("Driver ID cannot be null or empty");
        }
        logger.debug("Reading driver with id: {}", id);
        return driverRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException(
                        "Driver not found with id: " + id
                ));
    }

    @Override
    public Driver update(Driver driver) {
        if (driver == null || driver.getId() == null) {
            logger.error("Cannot update null driver or driver without ID");
            throw new IllegalArgumentException("Driver and ID cannot be null");
        }
        logger.info("Updating driver with id: {}", driver.getId());
        return driverRepository.save(driver);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Driver ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Driver ID cannot be null or empty");
        }
        logger.info("Deleting driver with id: {}", id);
        driverRepository.deleteById(id);
    }

}

