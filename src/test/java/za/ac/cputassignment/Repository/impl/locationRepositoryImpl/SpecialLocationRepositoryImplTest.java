package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpecialLocationRepositoryImplTest {

    private SpecialLocationRepository repository;
    private SpecialLocation specialLocation;

    private SpecialLocation getSavedSpecialLocation()
    {
        Set<SpecialLocation> savedSpecialLoca=this.repository.getAll();
        return savedSpecialLoca.iterator().next();
    }

    /////// come fix the factory
    @Before
    public void setUp() throws Exception {
        this.repository =SpecialLocationRepositoryImpl.getRepository();
        this.specialLocation.getId();
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