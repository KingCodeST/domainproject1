package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.Campus;

public class CampusFactory {


    public static Campus getCampus()
    {
        return new Campus();
    }


}
