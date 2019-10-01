package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.util.Misc;

public class StudentFactory {

    private static String  firstname, lastname;
    private static  int age;
    public  static Student getStudent(String student)
    {
                return new Student.Builder()
                                   .studentNum(Misc.generatedId())
                                  .firstname(firstname)
                                  .lastname(lastname)
                                  .age(age)
                                  .build();

    }

}
