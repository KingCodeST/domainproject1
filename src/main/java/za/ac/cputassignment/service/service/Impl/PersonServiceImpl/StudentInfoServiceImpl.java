package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.StudentInforRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.service.PersonService.StudentInfoService;

import java.util.Set;

@Service("ServiceImpl")
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    @Qualifier
    private StudentInforRepository repository;

    private StudentInfoServiceImpl()
    {
        this.repository = StudentInforRepositoryImpl.getRepository();
    }



    @Override
    public Set<StudentInfo> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        return this.repository.create(studentInfo);
    }

    @Override
    public StudentInfo read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        return this.repository.update(studentInfo);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
