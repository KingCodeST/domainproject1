package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.transportFactory.VanFactory;

import java.util.Set;

import static org.junit.Assert.*;

import static za.ac.cputassignment.factory.transportFactory.VanFactory.getVan;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VanRepositoryImplTest {

    private VanRepositoryImpl repository;
    private String vanID=null;


}