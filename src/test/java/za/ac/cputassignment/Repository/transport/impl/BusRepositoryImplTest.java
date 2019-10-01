package za.ac.cputassignment.Repository.transport.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.transport.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.transport.BusFactory;
import za.ac.cputassignment.util.Misc;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusRepositoryImplTest {

    private BusRepositoryImpl repository;
    private Bus bus;

    private Bus getSavedBus(){
        Set<Bus> savedArletInfor =this.repository.getAll();
        return savedArletInfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = BusRepositoryImpl.getRepository();
        this.bus = BusFactory.getBus("Red");
    }

    @Test
    public void d_getAll() {
        Set<Bus> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Bus created = this.repository.create(this.bus);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.bus);
    }

    @Test
    public void b_read() {
        Bus savedArlert = getSavedBus();
        System.out.println("In read, arletInfoId ="+savedArlert.getBusId());
        Bus read =this.repository.read(savedArlert.getBusId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String models = "20039FG";

        Bus arletInfor1=new Bus.Builder().copy(getSavedBus()).modelNo(models).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Bus updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(models,updated.getModelNo());
    }

    @Test
    public void delete() {
        Bus savedArletInfor =getSavedBus();
        this.repository.delete(savedArletInfor.getBusId());
        d_getAll();

    }
}