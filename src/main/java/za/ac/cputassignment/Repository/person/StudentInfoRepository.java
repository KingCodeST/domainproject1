package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.Set;

@Repository("StudentInforRepository")
public interface StudentInfoRepository extends JpaRepository<StudentInfo,String> {

}
