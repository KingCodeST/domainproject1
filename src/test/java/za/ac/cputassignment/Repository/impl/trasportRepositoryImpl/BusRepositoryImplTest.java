package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.transportFactory.BusFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusRepositoryImplTest {


    private BusRepository repository;
    private String busId;



}