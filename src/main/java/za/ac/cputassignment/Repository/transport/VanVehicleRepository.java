package za.ac.cputassignment.Repository.transport;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.VanVehicle;

import java.util.Set;

public interface VanVehicleRepository extends IRepository<VanVehicle,String> {
    Set<VanVehicle>getAll();
}
