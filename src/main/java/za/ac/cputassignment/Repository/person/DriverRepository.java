package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.Set;

@Repository("DriverRepository")
public interface DriverRepository extends JpaRepository<Driver,String> {

}
