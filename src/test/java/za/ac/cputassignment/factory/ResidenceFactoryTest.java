package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.Residence;

import static org.junit.Assert.*;

public class ResidenceFactoryTest {
        Residence rs;
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getResidence() {

        rs=new Residence.Builder()
                        .residenceName("Catsville")
                        .address("1 Browne Street")
                        .residenceId(12342)
                        .build();

        Assert.assertNotNull(rs);

    }
}