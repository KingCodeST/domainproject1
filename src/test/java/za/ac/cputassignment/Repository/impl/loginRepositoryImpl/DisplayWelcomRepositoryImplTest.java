package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayWelcom;
import za.ac.cputassignment.factory.loginFactory.DisplayWelcomFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DisplayWelcomRepositoryImplTest {

    private DisplayWelcomRepository repository;
    private DisplayWelcom displayWelcom;

    private DisplayWelcom getSavedDisplayWelcom()
    {
        Set<DisplayWelcom> savedDisplaywell=this.repository.getAll();
        return savedDisplaywell.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =DisplayWelcomRepositoryImpl.getRepository();
        this.displayWelcom = DisplayWelcomFactory.getDisplayeWelcom();
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