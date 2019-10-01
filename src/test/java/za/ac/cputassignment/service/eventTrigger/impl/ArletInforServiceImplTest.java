package za.ac.cputassignment.service.eventTrigger.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.eventTrigger.impl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTrigger.ArletInforFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class ArletInforServiceImplTest {

    private ArletInforRepositoryImpl repository;
    private ArletInfor arletInfor;

    @Before
    public void setUp() throws Exception {
        this.repository = ArletInforRepositoryImpl.getRepository();
        this.arletInfor = ArletInforFactory.GenericBuilder("Black");
    }

    @Test
    public void create() {
        ArletInfor created = this.repository.create(this.arletInfor);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.arletInfor);
    }

    @Test
    public void update() {
        String studges = "Gray";
        ArletInfor updated = new ArletInfor.Builder().blue(studges).build();
        System.out.println("In update, about_to_updated = " + arletInfor.getBlue());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(studges, updated.getBlue());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(arletInfor.getBlue());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, ArletInfor = " + arletInfor.getAlertInforId());
        ArletInfor read = this.repository.read(arletInfor.getAlertInforId());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(arletInfor, read);
    }

    @Test
    public void getAll() {
        Set<ArletInfor> arletInfors = this.repository.getAll();
        //System.out.println("In getAll, all = " + arletInfors);
    }
}