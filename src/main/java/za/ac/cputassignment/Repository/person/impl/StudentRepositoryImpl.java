package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.StudentRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.Set;

@Repository("InMemory")
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public Set<Student> getAll() {
        return null;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student read(String s) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
