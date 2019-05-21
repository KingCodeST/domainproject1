package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.factory.personFactory.StudentFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryImplTest {

    @Autowired
    private StudentRepository repository;
    private String studentId=null;


    @Test
    public void StudentCreateTest() throws IOException
    {
        Student student =StudentFactory.getStudent("Jack","Mabaso",89);
        Student result =repository.create(student);
        studentId =result.getId();
        Assert.assertNotNull(student);
    }

    @Test
    public void SiteStudentTest() throws IOException
    {
        Student student =repository.read(studentId);
        Assert.assertNotNull(student);
    }


}