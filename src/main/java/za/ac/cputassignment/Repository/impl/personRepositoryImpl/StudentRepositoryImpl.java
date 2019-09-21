package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;

import java.util.*;
@Repository("InMemory")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository=null;
    private Map<String,Student> students;

    private StudentRepositoryImpl()
    {
        this.students =new HashMap<>();
    }


    public static StudentRepository getRepository()
    {
        if(repository ==null) repository =new StudentRepositoryImpl();
        return repository;
    }




    @Override
    public Student create(Student student) {
        this.students.put(student.getStudentNum(),student);
        return student;
    }
    @Override
    public Student read(String s) {
        return this.students.get(s);
    }

    @Override
    public Student update(Student student) {
        this.students.replace(student.getStudentNum(),student);
        return this.students.get(student.getStudentNum());

    }

    @Override
    public void delete(String studentId) {
       this.students.remove(studentId);
    }

    @Override
    public Set<Student> getAll() {
        Collection<Student> students=this.students.values();
        Set<Student> set=new HashSet<>();
        set.addAll(students);
        return set;

    }


}
