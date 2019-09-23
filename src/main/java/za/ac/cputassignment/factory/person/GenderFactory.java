package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Gender;

public class GenderFactory {

    public static Gender GenericBuilder(String id, String gender)
    {
        return new Gender.Builder()
                        .setGenderId(id)
                        .setGenderGroup(gender)
                        .build();
    }

}
