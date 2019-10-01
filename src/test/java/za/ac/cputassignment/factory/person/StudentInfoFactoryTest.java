package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class StudentInfoFactoryTest {

    @Test
    public void genericBuilder() {
        StudentInfo ride=StudentInfoFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}