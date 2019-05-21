package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.factory.locationFactory.ResidenceFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResidenceRepositoryImplTest {

    private ResidenceRepository repository;
    private String residenceId=null;

    @Test
    public void ResidenceCreate() throws IOException
    {
        Residence residence=ResidenceFactory.getResidence("Catsville");
        Residence result =repository.create(residence);
        residenceId =result.getId();
        Assert.assertNotNull(residence);
    }

    @Test
    public void SiteResident() throws  IOException
    {
        Residence residence=repository.read(residenceId);
        Assert.assertNotNull(residence);
    }

}