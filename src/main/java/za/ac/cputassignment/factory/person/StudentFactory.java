package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Student;

public class StudentFactory {

    public  static Student getStudent(String studnum,String firstname,String lastname,int age)
    {
                return new Student.Builder()
                                   .studentNum(studnum)
                                  .firstname(firstname)
                                  .lastname(lastname)
                                  .age(age)
                                  .build();

    }

}
