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
    private String studentId=null;


}