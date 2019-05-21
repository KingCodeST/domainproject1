package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.factory.locationFactory.SportFieldFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SportFieldRepositoryImplTest {

    @Autowired
    private SportFieldRepository repository;
    private String sportFieldId =null;

    @Test
    public void SportFieldTest() throws IOException
    {
        SportField sportField =SportFieldFactory.getSportField(4,"1856 Dollar ","1883 May 43","UWC");
        SportField result =repository.create(sportField);
        sportFieldId =result.getId();
        Assert.assertNotNull(sportField);
    }

    @Test
    public  void SiteSportfieldTest() throws IOException
    {
        SportField sportField =repository.read(sportFieldId);
        Assert.assertNotNull(sportField);
    }


}