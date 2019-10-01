package za.ac.cputassignment.Repository.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.person.RaceRepository;
import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.factory.person.RaceFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {
    private RaceRepository repository;
    private Race arletInfor;

    private Race getSavedArletInfo(){
        Set<Race> savedRace =this.repository.getAll();
        return savedRace.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.arletInfor = RaceFactory.GenericBuilder("Red");
    }

    @Test
    public void d_getAll() {
        Set<Race> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Race created = this.repository.create(this.arletInfor);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.arletInfor);
    }

    @Test
    public void b_read() {
        Race savedArlert = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedArlert.getId());
        Race read =this.repository.read(savedArlert.getId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Black American";
        Race arletInfor1=new Race.Builder().copy(getSavedArletInfo()).raceGroup(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Race updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getRaceGroup());
    }

    @Test
    public void delete() {
        Race savedRace =getSavedArletInfo();
        this.repository.delete(savedRace.getId());
        d_getAll();

    }
}