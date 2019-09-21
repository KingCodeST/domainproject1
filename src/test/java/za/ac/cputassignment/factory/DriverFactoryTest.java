package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.person.Driver;

public class DriverFactoryTest {

    Driver s;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getBusDriver() {

        String dname ="Michael ";
        String lname="valia";
        String license="code19";
        int     age=34;

         s=new Driver.Builder()
                        .driverLastName(lname)
                        .driverName(dname)
                        .age(age)
                        .licanseCode(license)

                        .build();


    Assert.assertNotNull(s);

    }
}