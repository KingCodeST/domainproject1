package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Student;

public class StudentFactory {
    private static String studnum, firstname, lastname;
    private static  int age;
    public  static Student getStudent(String student)
    {
                return new Student.Builder()
                                   .studentNum(studnum)
                                  .firstname(firstname)
                                  .lastname(lastname)
                                  .age(age)
                                  .build();

    }

}
