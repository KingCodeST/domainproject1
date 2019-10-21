package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Gender;

import java.util.Set;

@Repository("GenderRepository")
public interface GenderRepository extends JpaRepository<Gender,String> {

}
