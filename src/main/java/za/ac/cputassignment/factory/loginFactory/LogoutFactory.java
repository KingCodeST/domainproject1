package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.Logout;

public class LogoutFactory {


    public static Logout getLogout()
    {
        return new Logout.Builder().id("765").build();
    }


}
