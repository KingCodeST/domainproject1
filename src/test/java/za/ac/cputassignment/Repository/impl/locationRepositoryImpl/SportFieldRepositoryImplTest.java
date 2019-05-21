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


}