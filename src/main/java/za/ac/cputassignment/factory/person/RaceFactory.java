package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Race;

public class RaceFactory {

    public static Race GenericBuilder(String id,String race)
    {
        return new Race.Builder()
                        .setid(id)
                        .raceGroup(race)
                        .build();
    }

}
