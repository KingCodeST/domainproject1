package za.ac.cputassignment.Repository.location.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.location.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.location.CampusFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CampusRepositoryImplTest {

    private CampusRepository repository;
    private Campus campus;

    private Campus getSavedCampus(){
        Set<Campus> savedCampus =this.repository.getAll();
        return savedCampus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CampusRepositoryImpl.getRepository();
        this.campus = CampusFactory.GenericBuilder("Mowbray");
    }

    @Test
    public void d_getAll() {
        Set<Campus> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Campus created = this.repository.create(this.campus);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.campus);
    }

    @Test
    public void b_read() {
        Campus savedArlert = getSavedCampus();
        System.out.println("In read, arletInfoId ="+savedArlert.getCampusId());
        Campus read =this.repository.read(savedArlert.getCampusId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Blue";
        Campus arletInfor1=new Campus.Builder().copy(getSavedCampus()).campusName(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Campus updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getName());
    }

    @Test
    public void delete() {
        Campus savedCampus =getSavedCampus();
        this.repository.delete(savedCampus.getCampusId());
        d_getAll();

    }
}