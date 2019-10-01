package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.factory.eventTrigger.RideFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RideRepositoryImplTest {

    private RideRepository repository;
    private Ride ride;

    private Ride getSavedRide(){
        Set<Ride> savedArletInfor =this.repository.getAll();
        return savedArletInfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RideRepositoryImpl.getRepository();
        this.ride = RideFactory.GenericBuilder("Beach");
    }

    @Test
    public void d_getAll() {
        Set<Ride> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Ride created = this.repository.create(this.ride);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.ride);
    }

    @Test
    public void b_read() {
        Ride savedArlert = getSavedRide();
        System.out.println("In read, arletInfoId ="+savedArlert.getRideNumber());
        Ride read =this.repository.read(savedArlert.getRideNumber());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Beach";
        Ride arletInfor1=new Ride.Builder().copy(getSavedRide()).setNameTrip(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Ride updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getRideNumber());
    }

    @Test
    public void delete() {
        Ride savedArletInfor =getSavedRide();
        this.repository.delete(savedArletInfor.getRideNumber());
        d_getAll();

    }
}