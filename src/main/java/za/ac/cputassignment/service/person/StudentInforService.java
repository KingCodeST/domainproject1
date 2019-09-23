package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface StudentInforService extends IService<StudentInfo,String> {
    Set<StudentInfo>getAll();
}
