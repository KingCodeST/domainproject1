package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.factory.locationFactory.SpecialLocationFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpecialLocationRepositoryImplTest {

    @Autowired
    private SpecialLocationRepository repository;
    private String specialLocationId=null;

    @Test
    public void SpecialLocationCreated() throws IOException
    {
        SpecialLocation specialLocation= SpecialLocationFactory.getSpecialFactory("Bellville Filled","Belville",3);
        SpecialLocation result =repository.create(specialLocation);
        specialLocationId = String.valueOf(result.getId());
        Assert.assertNotNull(specialLocation);
    }


}