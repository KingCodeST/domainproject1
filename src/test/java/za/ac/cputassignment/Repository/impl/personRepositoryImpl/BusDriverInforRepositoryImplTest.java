package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverInfor;
import za.ac.cputassignment.factory.personFactory.DriverInforFactory;

import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusDriverInforRepositoryImplTest {

    private DriverInforRepository repository;
    private DriverInfor driverInfor;

    private DriverInfor getSavedDriverInfor()
    {
        Set<DriverInfor> savedDriverInfor=this.repository.getAll();
        return savedDriverInfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DriverInforRepositoryImpl.getRepository();
        this.driverInfor = DriverInforFactory.getDriverInfor("#C12");
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