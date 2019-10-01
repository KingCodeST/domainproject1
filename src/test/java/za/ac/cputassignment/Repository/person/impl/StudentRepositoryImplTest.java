package za.ac.cputassignment.Repository.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.person.StudentRepository;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.factory.person.StudentFactory;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryImplTest {
    private StudentRepository repository;
    private Student student;

    private Student getSavedArletInfo(){
        Set<Student> savedStudent =this.repository.getAll();
        return savedStudent.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
        this.student = StudentFactory.getStudent("Zkulile");
    }

    @Test
    public void d_getAll() {
        Set<Student> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Student created = this.repository.create(this.student);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.student);
    }

    @Test
    public void b_read() {
        Student savedArlert = getSavedArletInfo();
        System.out.println("In read, arletInfoId ="+savedArlert.getStudentNum());
        Student read =this.repository.read(savedArlert.getStudentNum());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String name ="Vumile";
        Student student1=new Student.Builder().copy(getSavedArletInfo()).firstname(name).build();
        System.out.println("In update, about_to_updated ="+student1);
        Student updated  =this.repository.update(student1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(name,updated.getFirstname());
    }

    @Test
    public void delete() {
        Student savedStudent =getSavedArletInfo();
        this.repository.delete(savedStudent.getStudentNum());
        d_getAll();

    }
}