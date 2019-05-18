package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.factory.transportFactory.BusInforFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class BusInforRepositoryImplTest {

    private BusInforRepository repository;
    private BusInfor busInfor;

    private BusInfor getSavedBusinfor()
    {
        Set<BusInfor> savedBusInfor=this.repository.getAll();
        return savedBusInfor.iterator().next();
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