package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SportField;

import static org.junit.Assert.*;

public class SportFieldFactoryTest {
    SportField sp;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getSportField() {

        sp =new SportField.Builder()
                          .fname("Bellville Stadium")
                          .address("Robert sobukhwe Street")
                          .sFieldID(87663)
                          .build();
        Assert.assertNotNull(sp);
    }
}