package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideRepository;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.factory.eventTriggerFactory.RideFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RideRepositoryImplTest {

    @Autowired
   private RideRepository repository;
   private Ride ride;

   private Ride getSavedRide()
   {
       Set<Ride> savedRides =this.repository.getAll();
       return savedRides.iterator().next();

   }



    @Test
    public void d_getAll() {
       Set<Ride> all =this.repository.getAll();
       System.out.println("In GetAll, all"+all);

    }

    @Test
    public void a_create() {
       Ride creadted =this.repository.create(this.ride);
       System.out.println("In create, created ="+creadted);
       d_getAll();
       Assert.assertSame(creadted, this.ride);

    }

    @Test
    public void c_update() {
       String ids ="423";
       String colord="";
       Ride ride1=new Ride.Builder().Rideid(ids).color(colord).build();
       System.out.println("In update, about_to_updated ="+ride1);
       Ride updated =this.repository.update(ride1);

        Assert.assertSame(updated.getColor(),ride1);
    }

    @Test
    public void e_delete() {
       Ride savedRide=getSavedRide();
       this.repository.delete(savedRide.getId());
       d_getAll();
    }

    @Test
    public void b_read() {
       Ride savedRide =getSavedRide();
       System.out.println("In read, rideId"+savedRide.getId());
       Ride read =this.repository.read(savedRide.getId());
       System.out.println("In read, read ="+read);
       d_getAll();
       Assert.assertEquals(savedRide,read);
    }
}