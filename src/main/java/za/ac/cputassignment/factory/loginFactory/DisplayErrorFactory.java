package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.DisplayError;

public class DisplayErrorFactory {

    public static DisplayError getDisplayError(String Did)
    {
        return  new DisplayError.Builder()
                                .id(Did)
                                .buid();
    }

}
