package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.database.Connection;

public class ConnectionFactory {

    public  static Connection getConnection()
    {
        return  new Connection();
    }



}
