package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.StudentRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.service.PersonService.StudentService;

import java.util.Set;

@Service("ServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier
    private StudentRepository repository;

    private StudentServiceImpl()
    {
        this.repository = StudentRepositoryImpl.getRepository();
    }



    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Student create(Student student) {
        return this.repository.create(student);
    }

    @Override
    public Student read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Student update(Student student) {
        return this.repository.update(student);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
