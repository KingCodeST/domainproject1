package za.ac.cputassignment.factory.loginFactory;

public class LogoutFactory {


    public static Logout getLogout(String LouId)
    {
        return new Logout.Builder()
                        .id(LouId)
                        .build();
    }


}
