package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.Set;

public interface StudentRepository extends IRepository<Student,String> {
    Set<Student>getAll();
}
