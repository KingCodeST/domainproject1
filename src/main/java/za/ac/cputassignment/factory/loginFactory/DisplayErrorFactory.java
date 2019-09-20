package za.ac.cputassignment.factory.loginFactory;

public class DisplayErrorFactory {

    public static DisplayError getDisplayError(String Did)
    {
        return  new DisplayError.Builder()
                                .id(Did)
                                .buid();
    }

}
