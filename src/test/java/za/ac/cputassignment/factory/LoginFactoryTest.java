package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginFactoryTest {
    Login log;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getLogin() {

        String user="Luke";
        String pass ="123#block";

        log =new Login.Builder()
                    .username(user)
                    .password(pass)
                    .build();
        Assert.assertNotNull(user,pass);

    }
}