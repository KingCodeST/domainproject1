package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.StudentInforRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.service.PersonService.StudentInfoService;

import java.util.Set;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    private  static StudentInfoServiceImpl service=null;
    private StudentInforRepository repository;

    private StudentInfoServiceImpl()
    {
        this.repository = StudentInforRepositoryImpl.getRepository();
    }

    public static StudentInfoServiceImpl getService()
    {
        if(service ==null) service=StudentInfoServiceImpl.getService();
        return service;
    }

    @Override
    public Set<StudentInfo> getAll() {
        return null;
    }

    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        return null;
    }

    @Override
    public StudentInfo read(String s) {
        return null;
    }

    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
