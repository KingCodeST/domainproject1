package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student>getAll();

}
