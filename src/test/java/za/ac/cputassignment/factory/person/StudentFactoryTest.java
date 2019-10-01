package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class StudentFactoryTest {

    @Test
    public void getStudent() {
        Student ride=StudentFactory.getStudent(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}