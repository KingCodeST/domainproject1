package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.StudentRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Set<Student> studentSet;

    private StudentRepositoryImpl() {
        this.studentSet = new HashSet<>();
    }

    private Student FindStudentId(String studentId) {
        return this.studentSet.stream()
                .filter(driverBus -> driverBus.getStudentNum().trim().equals(studentId))
                .findAny()
                .orElse(null);
    }

    public static StudentRepositoryImpl getRepository() {
        if (repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Student> getAll() {
        return this.studentSet;
    }

    @Override
    public Student create(Student studentObj) {
        this.studentSet.add(studentObj);
        return studentObj;
    }

    @Override
    public Student read(String residenceLocationID) {
        Student studentObj = FindStudentId(residenceLocationID);
        return studentObj;
    }

    @Override
    public Student update(Student studentObj) {
        Student toDelete = FindStudentId(studentObj.getStudentNum());
        if (toDelete != null) {
            this.studentSet.remove(toDelete);
            return create(studentObj);
        }
        return null;
    }

    @Override
    public void delete(String studentId) {
        Student studentObj = FindStudentId(studentId);
        if (studentObj != null) this.studentSet.remove(studentObj);

    }

}
