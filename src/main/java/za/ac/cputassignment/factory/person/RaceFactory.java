package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.util.Misc;

public class RaceFactory {
    private static String id, race;
    public static Race GenericBuilder(String race)
    {
        return new Race.Builder()
                        .setid(Misc.generatedId())
                        .raceGroup(race)
                        .build();
    }

}
