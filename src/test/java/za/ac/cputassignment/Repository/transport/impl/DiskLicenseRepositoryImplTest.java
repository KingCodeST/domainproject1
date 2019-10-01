package za.ac.cputassignment.Repository.transport.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.transport.DiskLicenseRepository;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.factory.transport.DiskLicenseFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiskLicenseRepositoryImplTest {

    private DiskLicenseRepositoryImpl repository;
    private DiskLicense diskLicense;

    private DiskLicense getSavedArletInfo(){
        Set<DiskLicense> savedDisklicense =this.repository.getAll();
        return savedDisklicense.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DiskLicenseRepositoryImpl.getRepository();
        this.diskLicense = DiskLicenseFactory.BuilderGeneric("Red");
    }

    @Test
    public void d_getAll() {
        Set<DiskLicense> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        DiskLicense created = this.repository.create(this.diskLicense);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.diskLicense);
    }

    @Test
    public void b_read() {
        DiskLicense savedDisklicense = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedDisklicense.getCode());
        DiskLicense read =this.repository.read(savedDisklicense.getCode());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedDisklicense,read);

    }

    @Test
    public void c_update() throws ParseException {
        String color ="#FKJD";
        String dated ="10/10/2010";
        DateFormat dft =new SimpleDateFormat("dd/MM/yyyy");
        Date date =dft.parse((dated));
        DiskLicense diskLicense1=new DiskLicense.Builder().copy(getSavedArletInfo()).experationDate(date).build();
        System.out.println("In update, about_to_updated ="+diskLicense1);
        DiskLicense updated  =this.repository.update(diskLicense1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(date,updated.getExperationDate());
    }

    @Test
    public void delete() {
        DiskLicense savedDisklicense =getSavedArletInfo();
        this.repository.delete(savedDisklicense.getCode());
        d_getAll();

    }
}