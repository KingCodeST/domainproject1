package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.domain.login.DisplayError;
import za.ac.cputassignment.factory.loginFactory.DisplayErrorFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class DisplayErrorRepositoryImplTest {


    private DisplayErrorRepository repository;
    private String Displayeid=null;





    @Test
    public void getAll() {
    }

    @Test
    public void DisplayScreencreate() {


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