package za.ac.cputassignment.service.transport.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.transport.BusRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.transport.BusService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BusServiceImpl implements BusService {

    private static final Logger logger = LoggerFactory.getLogger(BusServiceImpl.class);

    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus retrieveByDesc(String modelNo) {
        logger.debug("Retrieving bus by model: {}", modelNo);
        Optional<Bus> bus = busRepository.findByModelNo(modelNo);
        if (bus.isEmpty()) {
            logger.warn("Bus not found with model: {}", modelNo);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Bus not found with model: " + modelNo
            );
        }
        return bus.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bus> getAll() {
        logger.debug("Fetching all buses");
        return busRepository.findAll();
    }

    @Override
    public Bus create(Bus bus) {
        if (bus == null) {
            logger.error("Cannot create null bus");
            throw new IllegalArgumentException("Bus cannot be null");
        }
        logger.info("Creating new bus: {}", bus.getBusId());
        return busRepository.save(bus);
    }

    @Override
    @Transactional(readOnly = true)
    public Bus read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Bus ID cannot be null or empty");
            throw new IllegalArgumentException("Bus ID cannot be null or empty");
        }
        logger.debug("Reading bus with id: {}", id);
        return busRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException(
                        "Bus not found with id: " + id
                ));
    }

    @Override
    public Bus update(Bus bus) {
        if (bus == null || bus.getId() == null) {
            logger.error("Cannot update null bus or bus without ID");
            throw new IllegalArgumentException("Bus and ID cannot be null");
        }
        logger.info("Updating bus with id: {}", bus.getId());
        return busRepository.save(bus);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Bus ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Bus ID cannot be null or empty");
        }
        logger.info("Deleting bus with id: {}", id);
        busRepository.deleteById(id);
    }

}

