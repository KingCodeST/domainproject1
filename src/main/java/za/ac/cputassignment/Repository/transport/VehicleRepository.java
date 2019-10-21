package za.ac.cputassignment.Repository.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.Set;

@Repository("VehicleRepository")
public interface VehicleRepository extends JpaRepository<Vehicle,String> {

}
