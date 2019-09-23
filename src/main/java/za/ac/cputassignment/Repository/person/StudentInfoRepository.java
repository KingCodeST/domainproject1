package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.Set;

public interface StudentInfoRepository extends IRepository<StudentInfo,String> {
    Set<StudentInfo>getAll();
}
