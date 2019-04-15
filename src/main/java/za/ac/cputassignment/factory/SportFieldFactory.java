package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.SportField;

public class SportFieldFactory {


    public  static SportField getSportField()
    {

        return  new SportField();

    }

}
