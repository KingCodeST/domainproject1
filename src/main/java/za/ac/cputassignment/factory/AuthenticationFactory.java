package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.login.Authentication;

public class AuthenticationFactory {

    public static Authentication getAuthentication()
    {
        return  new Authentication();
    }


}

