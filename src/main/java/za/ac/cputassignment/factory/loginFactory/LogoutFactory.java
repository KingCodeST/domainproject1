package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.Logout;

public class LogoutFactory {


    public static Logout getLogout(String LouId)
    {
        return new Logout.Builder()
                        .id(LouId)
                        .build();
    }


}
