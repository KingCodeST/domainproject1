package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.Set;

public interface StudentRepository extends JpaRepository<Student,String> {

}
