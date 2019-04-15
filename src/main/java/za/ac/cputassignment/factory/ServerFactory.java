package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.database.Server;

public class ServerFactory {

    public static Server getServer()
    {
        return  new Server();
    }



}
