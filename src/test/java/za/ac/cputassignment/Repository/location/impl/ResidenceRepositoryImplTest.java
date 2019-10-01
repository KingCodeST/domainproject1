package za.ac.cputassignment.Repository.location.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.location.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.factory.location.ResidenceFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResidenceRepositoryImplTest {

    private ResidenceRepository repository;
    private Residence residence;

    private Residence getSavedResidence(){
        Set<Residence> savedResidence =this.repository.getAll();
        return savedResidence.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ResidenceRepositoryImpl.getRepository();
        this.residence = ResidenceFactory.getResidence("Hanove");
    }

    @Test
    public void d_getAll() {
        Set<Residence> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Residence created = this.repository.create(this.residence);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.residence);
    }

    @Test
    public void b_read() {
        Residence savedArlert = getSavedResidence();
        System.out.println("In read, arletInfoId ="+savedArlert.getResidenceID());
        Residence read =this.repository.read(savedArlert.getResidenceID());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Cape Suits";
        Residence arletInfor1=new Residence.Builder().copy(getSavedResidence()).residenceName(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Residence updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getResidenceName());
    }

    @Test
    public void delete() {
        Residence savedResidence =getSavedResidence();
        this.repository.delete(savedResidence.getResidenceID());
        d_getAll();

    }
}