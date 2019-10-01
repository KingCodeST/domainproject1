package za.ac.cputassignment.Repository.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.person.GenderRepository;
import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.factory.person.GenderFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private GenderRepository repository;
    private Gender arletInfor;

    private Gender getSavedGender(){
        Set<Gender> savedGender =this.repository.getAll();
        return savedGender.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.arletInfor = GenderFactory.GenericBuilder("Male");
    }

    @Test
    public void d_getAll() {
        Set<Gender> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Gender created = this.repository.create(this.arletInfor);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.arletInfor);
    }

    @Test
    public void b_read() {
        Gender savedArlert = getSavedGender();
        System.out.println("In read, arletInfoId ="+savedArlert.getGenderId());
        Gender read =this.repository.read(savedArlert.getGenderId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String color ="Female";
        Gender arletInfor1=new Gender.Builder().copy(getSavedGender()).setGenderGroup(color).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Gender updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(color,updated.getGenderGroup());
    }

    @Test
    public void delete() {
        Gender savedGender =getSavedGender();
        this.repository.delete(savedGender.getGenderId());
        d_getAll();

    }
}