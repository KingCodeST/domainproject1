package za.ac.cputassignment.Repository.location.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.location.LocationRepository;
import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.factory.location.LocationFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationRepositoryImplTest {

    private LocationRepository repository;
    private Location location;

    private Location getSavedArletInfo(){
        Set<Location> savedArletInfor =this.repository.getAll();
        return savedArletInfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LocationRepositoryImpl.getRepository();
        this.location = LocationFactory.GenericBuilder("Khayelitsha");
    }

    @Test
    public void d_getAll() {
        Set<Location> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Location created = this.repository.create(this.location);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.location);
    }

    @Test
    public void b_read() {
        Location savedArlert = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedArlert.getLocationId());
        Location read =this.repository.read(savedArlert.getLocationId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Catville";
        Location arletInfor1=new Location.Builder().copy(getSavedArletInfo()).setResidenceName(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Location updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getResidenceName());
    }

    @Test
    public void delete() {
        Location savedArletInfor =getSavedArletInfo();
        this.repository.delete(savedArletInfor.getLocationId());
        d_getAll();

    }
}