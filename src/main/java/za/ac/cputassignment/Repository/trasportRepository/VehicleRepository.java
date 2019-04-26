package za.ac.cputassignment.Repository.trasportRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.Set;

public interface VehicleRepository extends IRepository<Vehicle,String> {

    Set<Vehicle>getAll();

}
