package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTriggerFactory.ArletInforFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArletInforRepositoryImplTest {

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
        //this.arletInfor = ArletInforFactory
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void d_getAll() {
    }

    @Test
    public void a_create() {
    }

    @Test
    public void c_update() {
    }

    @Test
    public void e_delete() {
    }

    @Test
    public void b_read() {
    }
}