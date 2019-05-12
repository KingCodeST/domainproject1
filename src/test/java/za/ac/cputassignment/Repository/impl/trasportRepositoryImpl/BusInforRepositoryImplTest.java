package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.factory.transportFactory.BusInforFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusInforRepositoryImplTest {

    private BusInforRepository repository;
    private BusInfor busInfor;

    private BusInfor getSavedBusinfor()
    {
        Set<BusInfor> savedBusInfor=this.repository.getAll();
        return savedBusInfor.iterator().next();
    }

    @Before
           public void setup()throws Exception
    {
        this.repository =BusInforRepositoryImpl.getRepository();
        this.busInfor = BusInforFactory.getBusInfor();

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