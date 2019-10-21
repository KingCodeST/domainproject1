package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Race;

import java.util.Set;

@Repository("RaceRepository")
public interface RaceRepository extends JpaRepository<Race,String> {

}
