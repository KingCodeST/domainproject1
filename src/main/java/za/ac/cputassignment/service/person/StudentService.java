package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Student retrieveByDesc(String studentDesc);
    List<Student> getAll();
}
