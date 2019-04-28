package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;

import static org.junit.Assert.*;

public class CampusRepositoryImplTest {

    private CampusRepository repository;
    Campus campus;
    @Before
    public void setUp() throws Exception {
        this.repository =CampusRepositoryImpl.getRepository();

    }

    @Test
    public void create() {

        this.repository.create(null);
        Assert.assertEquals(null,null);

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
    public void getAll() {
    }


}