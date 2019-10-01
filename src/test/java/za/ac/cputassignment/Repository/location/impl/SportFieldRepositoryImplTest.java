package za.ac.cputassignment.Repository.location.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.location.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.factory.location.SportFieldFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SportFieldRepositoryImplTest {

    private SportFieldRepository repository;
    private SportField sportField;

    private SportField getSavedSportField(){
        Set<SportField> savedSportField =this.repository.getAll();
        return savedSportField.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SportFieldRepositoryImpl.getRepository();
        this.sportField = SportFieldFactory.getSportField("Bellville");
    }

    @Test
    public void d_getAll() {
        Set<SportField> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        SportField created = this.repository.create(this.sportField);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.sportField);
    }

    @Test
    public void b_read() {
        SportField savedArlert = getSavedSportField();
        System.out.println("In read, arletInfoId ="+savedArlert.getsFieldID());
        SportField read =this.repository.read(savedArlert.getsFieldID());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Cape Town";
        SportField sportField1=new SportField.Builder().copy(getSavedSportField()).fname(color).build();
        System.out.println("In update, about_to_updated ="+sportField1);
        SportField updated  =this.repository.update(sportField1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getFname());
    }

    @Test
    public void delete() {
        SportField savedSportField =getSavedSportField();
        this.repository.delete(savedSportField.getsFieldID());
        d_getAll();

    }
}