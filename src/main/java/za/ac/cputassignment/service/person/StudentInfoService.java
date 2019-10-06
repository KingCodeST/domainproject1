package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface StudentInfoService extends IService<StudentInfo,String> {
    StudentInfo retrieveByDesc(String studentInfoDesc);
    List<StudentInfo> getAll();
}
