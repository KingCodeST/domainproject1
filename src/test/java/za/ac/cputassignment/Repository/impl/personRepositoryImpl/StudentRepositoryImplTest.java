package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.factory.personFactory.StudentFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryImplTest {

    private StudentRepository repository;
    private Student student;

    private Student getSavedStudent()
    {
        Set<Student> savedStudent =this.repository.getAll();
        return savedStudent.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =StudentRepositoryImpl.getRepository();
        this.student = StudentFactory.getStudent("Michael","Valphin",5);

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}