package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface VehicleService extends IService<Vehicle,String> {
    Set<Vehicle> getAll();
}
