package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.factory.personFactory.StudentFactory;

import java.util.Set;

import static org.junit.Assert.*;
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