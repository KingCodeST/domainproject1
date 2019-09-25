package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentRepository;
import za.ac.cputassignment.Repository.person.impl.StudentRepositoryImpl;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.person.StudentService;

import java.util.Set;

@Service("serviceImpl")
public class StudentServiceImpl implements StudentService {

    private static StudentServiceImpl service=null;
    private StudentRepository repository;

    private StudentServiceImpl(){
        this.repository = StudentRepositoryImpl.getRepository();
    }

    public static StudentServiceImpl getService(){
        if(service ==null) service =new StudentServiceImpl();
        return service;
    }



    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Student create(Student objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Student read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Student update(Student objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

