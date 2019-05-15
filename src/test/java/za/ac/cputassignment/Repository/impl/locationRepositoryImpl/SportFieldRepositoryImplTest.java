package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.factory.locationFactory.SportFieldFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SportFieldRepositoryImplTest {

    private SportFieldRepository repository;
    private SportField sportField;

    private SportField getSavedSportField()
    {
        Set<SportField> savedSportField=this.repository.getAll();
        return savedSportField.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =SportFieldRepositoryImpl.getRepository();
        this.sportField = SportFieldFactory.getSportField(4,"123","Song");
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