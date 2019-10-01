package za.ac.cputassignment.Repository.transport.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.transport.VanRepository;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.transport.VanFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VanRepositoryImplTest {
    
    private VanRepositoryImpl repository;
    private Van arletInfor;

    private Van getSavedArletInfo(){
        Set<Van> savedVan =this.repository.getAll();
        return savedVan.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = VanRepositoryImpl.getRepository();
        this.arletInfor = VanFactory.getVan("BMW");
    }

    @Test
    public void d_getAll() {
        Set<Van> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Van created = this.repository.create(this.arletInfor);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.arletInfor);
    }

    @Test
    public void b_read() {
        Van savedArlert = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedArlert.getVanId());
        Van read =this.repository.read(savedArlert.getVanId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String names ="Toyota";
        Van arletInfor1=new Van.Builder().copy(getSavedArletInfo()).brand(names).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Van updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(names,updated.getBrand());
    }

    @Test
    public void delete() {
        Van savedVan =getSavedArletInfo();
        this.repository.delete(savedVan.getVanId());
        d_getAll();

    }
}