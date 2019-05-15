package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.domain.login.DisplayError;
import za.ac.cputassignment.factory.loginFactory.DisplayErrorFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DisplayErrorRepositoryImplTest {

    private DisplayErrorRepository repository;
    private DisplayError displayError;

    private DisplayError getSavedDisplayError()
    {
        Set<DisplayError> savedDisplayError=this.repository.getAll();
        return savedDisplayError.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =DisplayErrorRepositoryImpl.getRepository();
        this.displayError = DisplayErrorFactory.getDisplayError();
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