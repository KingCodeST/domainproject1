package za.ac.cputassignment.service.service.PersonService;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface StudentInfoService extends IService<StudentInfo,String> {
    Set<StudentInfo> getAll();
}
