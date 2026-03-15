package za.ac.cputassignment.Repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.person.Student;

import java.util.List;
import java.util.Optional;

@Repository("StudentRepository")
public interface StudentRepository extends JpaRepository<Student, String> {

    /**
     * Find student by first name (case-insensitive)
     */
    Optional<Student> findByFirstname(String firstname);

    /**
     * Find students by last name
     */
    List<Student> findByLastname(String lastname);

    /**
     * Find student by student number
     */
    Optional<Student> findByStudentNum(String studentNum);

    /**
     * Find students by age
     */
    List<Student> findByAge(int age);

    /**
     * Find students by gender
     */
    List<Student> findByGender(String gender);

    /**
     * Custom query to find student by first name and last name
     */
    @Query("SELECT s FROM Student s WHERE LOWER(s.firstname) = LOWER(:firstname) AND LOWER(s.lastname) = LOWER(:lastname)")
    Optional<Student> findByFirstnameAndLastname(@Param("firstname") String firstname, @Param("lastname") String lastname);

}
