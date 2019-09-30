package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.util.Misc;

public class GenderFactory {
    private static String id, gender;
    public static Gender GenericBuilder(String gender)
    {
        return new Gender.Builder()
                        .setGenderId(Misc.generatedId())
                        .setGenderGroup(gender)
                        .build();
    }

}
