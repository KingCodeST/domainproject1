package za.ac.cputassignment.factory.loginFactory;

public class LoginFactory {

    public static Login getLogin(String LogId)
    {

        return  new Login.Builder()
                         .loginId(LogId)
                        .build();

    }



}
