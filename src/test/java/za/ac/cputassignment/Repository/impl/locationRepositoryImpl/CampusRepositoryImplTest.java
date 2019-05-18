package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.locationFactory.CampusFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@AutoConfigurationPackage
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CampusRepositoryImplTest {

    @Bean
     public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

    @Autowired
    private CampusRepository repository;
    private String  campusId=null;

    private Campus getSavedCampus()
    {
        Set<Campus> savedCampus=this.repository.getAll();
        return savedCampus.iterator().next();
    }



    @Test
    public void create() {
        Campus campus=CampusFactory.getCampus("District Six");
        Campus result= repository.create(campus);
        campusId =result.getCampusId();
        Assert.assertNotNull(campus);

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