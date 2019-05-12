package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Set<Student> getAll();
}
