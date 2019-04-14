package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.Student;

public class StudentFactory {

    public  static Student getStudent(String firstname,String lastname,int age)
    {
                return new Student.Builder()
                                  .firstname(firstname)
                                  .lastname(lastname)
                                  .age(age)
                                  .build();

    }

}
