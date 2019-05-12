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

    private Student findStudent(String sId)
    {
        return this.students.stream()
                            .filter(student -> student.getId().trim().equals(sId))
                            .findAny()
                            .orElse(null);
    }

    public static StudentRepository getRepository()
    {
        if(repository ==null) repository =new StudentRepositoryImpl();
        return repository;
    }




    @Override
    public Student create(Student student) {
        this.students.add(student);
        return student;
    }
    @Override
    public Student read(String s) {
        Student student =findStudent(s);
        return student;
    }

    @Override
    public Student update(Student student) {

        Student student1 =findStudent(student.getId());
        if(student1 !=null)
        {
            this.students.remove(student1);
            return create(student);
        }

        return  null;
    }

    @Override
    public void delete(String studentId) {
        Student student =findStudent(studentId);
        if(student !=null )this.students.remove(student);

    }

    @Override
    public Set<Student> getAll() {
        return this.students;
    }


}
