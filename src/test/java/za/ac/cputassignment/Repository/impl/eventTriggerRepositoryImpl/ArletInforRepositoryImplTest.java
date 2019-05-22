 package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTriggerFactory.ArletInforFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArletInforRepositoryImplTest {

    @Autowired
    private ArletInforRepository repository;
    private ArletInfor arletInfor;

    private ArletInfor getSavedArletInfor()
    {
        Set<ArletInfor> savedArlets=this.repository.getAll();
        return savedArlets.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =ArletInforRepositoryImpl.getRepository();
    //    this.arletInfor = ArletInforFactory.
    }


    @Test
    public void d_getAll() {
    Set<ArletInfor> all =this.repository.getAll();
    System.out.println("In getAll, all ="+all);
    Assert.assertSame(1,all.size());
    }

    @Test
    public void a_create() {
        ArletInfor created=this.repository.create(this.arletInfor);
        System.out.println("In create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.arletInfor);
    }

    @Test
    public void c_update() {
        String blue ="";
        String green="";
        String red ="";
        String simpledate="";
        ArletInfor arletInfor=new ArletInfor.Builder().blue(blue).green(green).red(red).simpledate(simpledate).build();
        System.out.println("In update, about_to_updated = "+arletInfor);
        ArletInfor updated =this.repository.update(arletInfor);
        Assert.assertSame(arletInfor,updated);


    }

    @Test
    public void e_delete() {
        ArletInfor savedArlet =getSavedArletInfor();
        this.repository.delete(savedArlet.getId());
        d_getAll();
    }

    @Test
    public void b_read() {
        ArletInfor savedArt=getSavedArletInfor();
        System.out.println("In read, arlertId = "+savedArt.getId());
        ArletInfor read =this.repository.read(savedArt.getId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArt,read);


    }
}


