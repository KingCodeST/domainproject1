package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.factory.locationFactory.ResidenceFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResidenceRepositoryImplTest {

    private ResidenceRepository repository;
    private Residence residence;


    private Residence getSavedResidence()
    {
        Set<Residence> savedResidence=this.repository.getAll();
        return savedResidence.iterator().next();
    }



    @Before
    public void setUp() throws Exception {
        this.repository =ResidenceRepositoryImpl.getRepository();
        this.residence = ResidenceFactory.getResidence("");

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