package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.util.Misc;

public class GenderFactory {

    public static Gender GenericBuilder(String id, String gender)
    {
        return new Gender.Builder()
                        .setGenderId(Misc.generatedId())
                        .setGenderGroup(gender)
                        .build();
    }

}
