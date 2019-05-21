package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.factory.personFactory.StudentInfoFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentInforRepositoryImplTest {

    private StudentInforRepository repository;
    private String studentInfoId=null;

    @Test
    public  void StudentInforCreateTest() throws IOException
    {
        StudentInfo studentInfo =StudentInfoFactory.getStudentInfo("#tr","1849 Golsd 9023");
        StudentInfo result =repository.create(studentInfo);
        studentInfoId =result.getId();
        Assert.assertNotNull(studentInfo);
    }

    @Test
    public void SiteStudentInfor() throws IOException
    {
        StudentInfo studentInfo =repository.read(studentInfoId);
        Assert.assertNotNull(studentInfo);
    }


}