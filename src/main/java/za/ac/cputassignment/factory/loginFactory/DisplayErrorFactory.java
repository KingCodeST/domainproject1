package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.DisplayError;

public class DisplayErrorFactory {

    public static DisplayError getDisplayError()
    {
        return  new DisplayError.Builder()
                                .id("32#")
                                .buid();
    }

}
