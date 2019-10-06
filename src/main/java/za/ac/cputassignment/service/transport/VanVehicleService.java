package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface VanVehicleService extends IService<VanVehicle, String> {
    VanVehicle retrieveByDesc(String vanVehicleDesc);
    List<VanVehicle> getAll();
}
