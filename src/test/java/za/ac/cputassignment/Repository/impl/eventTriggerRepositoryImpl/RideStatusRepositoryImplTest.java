package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.factory.eventTriggerFactory.RideFactory;
import za.ac.cputassignment.factory.eventTriggerFactory.RideStatusFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RideStatusRepositoryImplTest {

    private RideStatusRepository repository;
    private RideStatus rideStatus;

    private RideStatus getSavedRideStatus()
    {
        Set<RideStatus> savedRideStatus= this.repository.getAll();
        return savedRideStatus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository =RideStatusRepositoryImpl.getRepository();
        this.rideStatus = RideStatusFactory.getRideStatus();
    }





    @Test
    public void d_getAll() {
        Set<RideStatus> all =this.repository.getAll();
        System.out.println("In getAll, all ="+all);


    }

    @Test
    public void a_create() {
        RideStatus created=this.repository.create(this.rideStatus);
        System.out.println("In create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.rideStatus);
    }

    @Test
    public void update() {
        String id="43tf";

        RideStatus rideStatus=new RideStatus.Builder().id(id).build();
        System.out.println("In update,about_to_updated ="+rideStatus);
        RideStatus updated =this.repository.update(rideStatus);;
        System.out.println("In updated,updated ="+updated);
        Assert.assertSame(id,updated.getId());
    }

    @Test
    public void delete() {
        RideStatus savedride =getSavedRideStatus();
        this.repository.delete(savedride.getId());
        d_getAll();
    }

    @Test
    public void read() {
        RideStatus savedRidestatus =getSavedRideStatus();
        System.out.println("In read, ridestatusId ="+savedRidestatus);
        RideStatus read =this.repository.read(savedRidestatus.getId());
        System.out.println("In read, read ="+read);
        d_getAll();
        Assert.assertEquals(savedRidestatus,read);
    }
}