package za.ac.cputassignment.service.transport.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.transport.VanRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.transport.VanService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VanServiceImpl implements VanService {

    private static final Logger logger = LoggerFactory.getLogger(VanServiceImpl.class);

    @Autowired
    private VanRepository vanRepository;

    @Override
    public Van retrieveByDesc(String numPlate) {
        logger.debug("Retrieving van by number plate: {}", numPlate);
        Optional<Van> van = vanRepository.findByNumPlate(numPlate);
        if (van.isEmpty()) {
            logger.warn("Van not found with number plate: {}", numPlate);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Van not found with number plate: " + numPlate
            );
        }
        return van.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Van> getAll() {
        logger.debug("Fetching all vans");
        return vanRepository.findAll();
    }

    @Override
    public Van create(Van van) {
        if (van == null) {
            logger.error("Cannot create null van");
            throw new IllegalArgumentException("Van cannot be null");
        }
        logger.info("Creating new van: {}", van.getVanId());
        return vanRepository.save(van);
    }

    @Override
    @Transactional(readOnly = true)
    public Van read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Van ID cannot be null or empty");
            throw new IllegalArgumentException("Van ID cannot be null or empty");
        }
        logger.debug("Reading van with id: {}", id);
        return vanRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException(
                        "Van not found with id: " + id
                ));
    }

    @Override
    public Van update(Van van) {
        if (van == null || van.getId() == null) {
            logger.error("Cannot update null van or van without ID");
            throw new IllegalArgumentException("Van and ID cannot be null");
        }
        logger.info("Updating van with id: {}", van.getId());
        return vanRepository.save(van);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Van ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Van ID cannot be null or empty");
        }
        logger.info("Deleting van with id: {}", id);
        vanRepository.deleteById(id);
    }

}

