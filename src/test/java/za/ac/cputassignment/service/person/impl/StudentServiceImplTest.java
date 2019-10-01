package za.ac.cputassignment.service.person.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.person.impl.StudentRepositoryImpl;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.factory.person.StudentFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class StudentServiceImplTest {

    private StudentRepositoryImpl repository;
    private Student student;

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
        this.student = StudentFactory.getStudent("Woza");
    }

    @Test
    public void create() {
        Student created = this.repository.create(this.student);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.student);
    }

    @Test
    public void update() {
        String newTreatmentType = "Mali";
        Student updated = new Student.Builder().firstname("Mali").build();
        System.out.println("In update, about_to_updated = " + student.getFirstname());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newTreatmentType, updated.getFirstname());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(student.getStudentNum());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, Student = "+ student.getStudentNum());
        Student read = this.repository.read(student.getStudentNum());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(student,read);
    }

    @Test
    public void getAll() {
        Set<Student> students = this.repository.getAll();
        //System.out.println("In getAll, all = " + students);
    }
}
