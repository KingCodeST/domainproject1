package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.factory.personFactory.StudentInfoFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentInforRepositoryImplTest {

    private StudentInforRepository repository;
    private StudentInfo studentInfo;

    private StudentInfo getSavedStudentinfo()
    {
        Set<StudentInfo> savedStudentInfor=this.repository.getAll();
        return savedStudentInfor.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository =StudentInforRepositoryImpl.getRepository();
        this.studentInfo = StudentInfoFactory.getStudentInfo();

    }

    @Test
    public void getRepository() {
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