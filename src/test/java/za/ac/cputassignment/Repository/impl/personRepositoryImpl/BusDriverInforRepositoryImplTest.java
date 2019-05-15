package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverInfor;
import za.ac.cputassignment.factory.personFactory.DriverInforFactory;

import java.util.Set;

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
        this.repository = BusBusDriverInforRepositoryImpl.getRepository();
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