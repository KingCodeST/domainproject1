package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.database.Client;

public class ClientFactory {


    public static Client getClient()
    {
        return new Client();
    }

}
