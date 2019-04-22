package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.Campus;

import static org.junit.Assert.*;

public class CampusFactoryTest {
        Campus cp;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getCampus() {

        String Cname="Granger Bay";
        int    idnum=433298;

        cp =new Campus.Builder()
                      .campusName(Cname)
                      .campusId(idnum)
                      .build();

        Assert.assertNotNull(cp);
    }
}