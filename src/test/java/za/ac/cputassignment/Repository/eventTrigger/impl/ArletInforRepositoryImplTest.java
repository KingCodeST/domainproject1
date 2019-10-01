package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTrigger.ArletInforFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArletInforRepositoryImplTest {

    private ArletInforRepository repository;
    private ArletInfor arletInfor;

    private ArletInfor getSavedArletInfo(){
        Set<ArletInfor> savedArletInfor =this.repository.getAll();
        return savedArletInfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ArletInforRepositoryImpl.getRepository();
        this.arletInfor = ArletInforFactory.GenericBuilder("Red");
    }

    @Test
    public void d_getAll() {
        Set<ArletInfor> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        ArletInfor created = this.repository.create(this.arletInfor);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.arletInfor);
    }

    @Test
    public void b_read() {
        ArletInfor savedArlert = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedArlert.getAlertInforId());
        ArletInfor read =this.repository.read(savedArlert.getAlertInforId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Blue";
        ArletInfor arletInfor1=new ArletInfor.Builder().copy(getSavedArletInfo()).blue(color).green(color).red(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        ArletInfor updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getBlue());
    }

    @Test
    public void delete() {
        ArletInfor savedArletInfor =getSavedArletInfo();
        this.repository.delete(savedArletInfor.getAlertInforId());
        d_getAll();

    }
}