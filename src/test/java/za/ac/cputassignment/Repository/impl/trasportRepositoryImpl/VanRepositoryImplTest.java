package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.transportFactory.VanFactory;

import java.util.Set;

import static org.junit.Assert.*;

import static za.ac.cputassignment.factory.transportFactory.VanFactory.getVan;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
        this.van =VanFactory.getVan("123R","Toyota","#BLA",9.0);



       // this.van = getVan("Test Van","BL$#233","CA3234",8.09);

    }
    @Test
    public void a_create() {
        Van createdvan =this.repository.create(van);
        System.out.println("In create, createdvan ="+createdvan);
        d_getAll();
        Assert.assertSame(createdvan,this.van);
    }

    @Test
    public void c_update() {
        String newvan ="Test Van";
        String brasnd="CA434";
        String numplate="C232";
        double petrol =9.00;
          Van van1 = new Van.Builder().patrol(petrol).numPlate(numplate).brand(brasnd).vanId(newvan).build();
         System.out.println("In update, about to update"+ van1);
          Van updated =this.repository.update(van1);
         System.out.println("In Update,Updated = "+updated);
         Assert.assertSame(van1,updated);
         d_getAll();

    }

    @Test
    public void e_delete() {
        Van savedVan=getSavedVan();
        this.repository.delete(savedVan.getVanId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Van savedVan =getSavedVan();
        System.out.println("In read, vanId ="+savedVan.getVanId());
        Van read =this.repository.read(savedVan.getVanId());
        System.out.println("In read, read ="+ read);
        d_getAll();
        Assert.assertEquals(savedVan,read);

    }

    @Test
    public void d_getAll() {
        Set<Van> all =this.repository.getAll();
        System.out.println("in getAll, all="+ all);
        Assert.assertSame(1,all.size());
    }
}