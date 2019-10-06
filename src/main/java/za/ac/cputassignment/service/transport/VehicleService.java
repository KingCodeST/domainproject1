package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface VehicleService extends IService<Vehicle,String> {
    Vehicle retrieveByDesc(String vehicleDesc);
    List<Vehicle> getAll();
}
