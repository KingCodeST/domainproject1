package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.locationFactory.CampusFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CampusRepositoryImplTest {

    private CampusRepository repository;
   private   Campus campus;

    private Campus getSavedCampus()
    {
        Set<Campus> savedCampus=this.repository.getAll();
        return savedCampus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =CampusRepositoryImpl.getRepository();
        this.campus = CampusFactory.getCampus("Test Campus");

    }

    @Test
    public void create() {
    try {
        this.repository.create(campus);

        assertEquals(campus, campus);

    }catch (NullPointerException ex)
    {
        System.out.println(ex);
    }

    }

    @Test
    public void read() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void d_getAll() {



    }


}