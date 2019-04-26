package za.ac.cputassignment.Repository.personRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.Set;

public interface StudentInforRepository extends IRepository<StudentInfo, String> {

    Set<StudentInfo> getAll();




}
