package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository=null;
    private  Set<Student> students;

    private StudentRepositoryImpl()
    {
        this.students =new HashSet<>();
    }

    private static StudentRepository getRepository()
    {
        if(repository ==null) repository =new StudentRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Student> getAll() {
        return this.students;
    }

    @Override
    public Student create(Student student) {
        this.students.add(student);
        return student;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Student read(String s) {
        return null;
    }
}
