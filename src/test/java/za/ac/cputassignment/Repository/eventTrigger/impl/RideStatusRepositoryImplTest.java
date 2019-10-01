package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.factory.eventTrigger.RideStatusFactory;
import za.ac.cputassignment.util.Misc;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RideStatusRepositoryImplTest {

    private RideStatusRepository repository;
    private RideStatus rideStatus;

    private RideStatus getSavedRide(){
        Set<RideStatus> savedRideStatus =this.repository.getAll();
        return savedRideStatus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RideStatusRepositoryImpl.getRepository();
        this.rideStatus = RideStatusFactory.GenericBuilder("Red");
    }

    @Test
    public void d_getAll() {
        Set<RideStatus> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        RideStatus created = this.repository.create(this.rideStatus);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.rideStatus);
    }

    @Test
    public void b_read() {
        RideStatus savedArlert = getSavedRide();
        System.out.println("In read, arletInfoId ="+savedArlert.getRideStatusId());
        RideStatus read =this.repository.read(savedArlert.getRideStatusId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        Boolean f= true;
        RideStatus arletInfor1=new RideStatus.Builder().copy(getSavedRide()).setOn(f).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        RideStatus updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(f,updated.isOn());
    }

    @Test
    public void delete() {
        RideStatus savedRideStatus =getSavedRide();
        this.repository.delete(savedRideStatus.getRideStatusId());
        d_getAll();

    }
}