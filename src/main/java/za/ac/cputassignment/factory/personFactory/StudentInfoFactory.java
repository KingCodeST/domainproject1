package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.StudentInfo;

public class StudentInfoFactory {

    public  static StudentInfo getStudentInfo()
    {
        return  new StudentInfo.Builder()
                                .id("145")
                                .address("1836 tambo hermanus")
                                .build();
    }



}
