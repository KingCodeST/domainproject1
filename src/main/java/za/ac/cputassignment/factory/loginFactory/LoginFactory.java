package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.Login;

public class LoginFactory {

    public static Login getLogin()
    {

        return  new Login.Builder()
                         .loginId("54#")
                        .build();

    }



}
