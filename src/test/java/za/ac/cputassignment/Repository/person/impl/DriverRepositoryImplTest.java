package za.ac.cputassignment.Repository.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.factory.person.DriverFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverRepositoryImplTest {

    private DriverRepository repository;
    private Driver driver;

    private Driver getSavedDriver(){
        Set<Driver> savedDriver =this.repository.getAll();
        return savedDriver.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DriverRepositoryImpl.getRepository();
        this.driver = DriverFactory.BuilderGeneric("Michael");
    }

    @Test
    public void d_getAll() {
        Set<Driver> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Driver created = this.repository.create(this.driver);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.driver);
    }

    @Test
    public void b_read() {
        Driver savedArlert = getSavedDriver();
        System.out.println("In read, arletInfoId ="+savedArlert.getDriverID());
        Driver read =this.repository.read(savedArlert.getDriverID());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Johnson";
        Driver driver1=new Driver.Builder().copy(getSavedDriver()).driverName(color).build();
        System.out.println("In update, about_to_updated ="+driver1);
        Driver updated  =this.repository.update(driver1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getDriverName());
    }

    @Test
    public void delete() {
        Driver savedDriver =getSavedDriver();
        this.repository.delete(savedDriver.getDriverID());
        d_getAll();

    }
}