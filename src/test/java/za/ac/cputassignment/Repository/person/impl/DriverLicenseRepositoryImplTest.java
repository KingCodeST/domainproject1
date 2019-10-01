package za.ac.cputassignment.Repository.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.person.DriverLicenseRepository;
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.factory.person.DriverLicenseFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverLicenseRepositoryImplTest {

    private DriverLicenseRepository repository;
    private DriverLicense driverLicense;

    private DriverLicense getSavedDriverLicense(){
        Set<DriverLicense> savedDriverLicense =this.repository.getAll();
        return savedDriverLicense.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DriverLicenseRepositoryImpl.getRepository();
        this.driverLicense = DriverLicenseFactory.GenericBuilder("#2018645HF09");
    }

    @Test
    public void d_getAll() {
        Set<DriverLicense> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        DriverLicense created = this.repository.create(this.driverLicense);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.driverLicense);
    }

    @Test
    public void b_read() {
        DriverLicense savedArlert = getSavedDriverLicense();
        System.out.println("In read, arletInfoId ="+savedArlert.getCode());
        DriverLicense read =this.repository.read(savedArlert.getCode());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update()throws ParseException {
        String color ="#gdfda";
        String str="10/56/2003";
        DateFormat dtf=new SimpleDateFormat("dd/mm/yyyy");
        Date date =dtf.parse(str);

        DriverLicense driverLicense1=new DriverLicense.Builder().copy(getSavedDriverLicense()).setExpiration(date).build();
        System.out.println("In update, about_to_updated ="+driverLicense1);
        DriverLicense updated  =this.repository.update(driverLicense1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(date,updated.getExperationDate());
    }

    @Test
    public void delete() {
        DriverLicense savedDriverLicense =getSavedDriverLicense();
        this.repository.delete(savedDriverLicense.getCode());
        d_getAll();

    }
}