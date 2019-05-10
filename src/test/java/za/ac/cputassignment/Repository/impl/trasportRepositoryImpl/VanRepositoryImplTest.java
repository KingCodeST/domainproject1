package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.transportFactory.VanFactory;

import java.util.Set;

import static org.junit.Assert.*;
import static za.ac.cputassignment.factory.transportFactory.VanFactory.BuildVan;
import static za.ac.cputassignment.factory.transportFactory.VanFactory.getVan;

public class VanRepositoryImplTest {

    private VanRepositoryImpl repository;
    private Van van;

    private Van getSavedVan()
    {
        Set<Van> savedVans = this.repository.getAll();
        return savedVans.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (VanRepositoryImpl) VanRepositoryImpl.getRepository();
        this.van = getVan("Test Van","BL$#233","CA3234",8.09);

    }







    @Test
    public void create() {
        Van createdvan =this.repository.create(this.van);
        System.out.println("In create, createdvan ="+createdvan);
        getAll();
        Assert.assertSame(createdvan,this.van);
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Van savedVan =getSavedVan();
        System.out.println("In read, vanId ="+savedVan.getVanId());
        Van read =this.repository.read(savedVan.getVanId());
        System.out.println("In read, read ="+ read);
        getAll();
        Assert.assertEquals(savedVan,read);

    }

    @Test
    public void getAll() {
        Set<Van> all =this.repository.getAll();
        System.out.println("in getAll, all="+ all);
        Assert.assertSame(1,all.size());
    }
}