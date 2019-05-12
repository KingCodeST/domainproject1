package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.StudentRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.service.PersonService.StudentService;

import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    private static StudentServiceImpl service=null;
    private StudentRepository repository;

    private StudentServiceImpl()
    {
        this.repository = StudentRepositoryImpl.getRepository();
    }

    public static StudentServiceImpl getService()
    {
        if(service==null) service=StudentServiceImpl.getService();
        return service;
    }

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
