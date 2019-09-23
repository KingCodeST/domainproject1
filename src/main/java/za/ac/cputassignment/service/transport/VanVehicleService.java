package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface VanVehicleService extends IService<VanVehicle, String> {
    Set<VanVehicle> getAll();
}
