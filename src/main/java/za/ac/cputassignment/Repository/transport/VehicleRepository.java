package za.ac.cputassignment.Repository.transport;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.Set;

public interface VehicleRepository extends IRepository<Vehicle,String> {
    Set<Vehicle>getAll();
}
