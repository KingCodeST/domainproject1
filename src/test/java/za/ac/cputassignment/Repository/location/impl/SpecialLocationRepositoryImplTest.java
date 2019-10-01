package za.ac.cputassignment.Repository.location.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.location.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.factory.location.SpecialLocationFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpecialLocationRepositoryImplTest {

    private SpecialLocationRepository repository;
    private SpecialLocation specialLocation;

    private SpecialLocation getSavedSpecialLocation(){
        Set<SpecialLocation> savedSpecialLocation =this.repository.getAll();
        return savedSpecialLocation.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SpecialLocationRepositoryImpl.getRepository();
        this.specialLocation = SpecialLocationFactory.getSpecialFactory("Willington");
    }

    @Test
    public void d_getAll() {
        Set<SpecialLocation> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        SpecialLocation created = this.repository.create(this.specialLocation);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.specialLocation);
    }

    @Test
    public void b_read() {
        SpecialLocation savedSpecialLocation= getSavedSpecialLocation();
        System.out.println("In read, arletInfoId ="+savedSpecialLocation.getSLocalId());
        SpecialLocation read =this.repository.read(savedSpecialLocation.getSLocalId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedSpecialLocation,read);

    }

    @Test
    public void c_update() {
        String color ="Woster";
        SpecialLocation arletInfor1=new SpecialLocation.Builder().copy(getSavedSpecialLocation()).name(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        SpecialLocation updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getName());
    }

    @Test
    public void delete() {
        SpecialLocation savedSpecialLocation =getSavedSpecialLocation();
        this.repository.delete(savedSpecialLocation.getSLocalId());
        d_getAll();

    }
}