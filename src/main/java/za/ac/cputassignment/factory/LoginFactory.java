package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.login.Login;

public class LoginFactory {

    public static Login getLogin()
    {

        return  new Login();

    }



}