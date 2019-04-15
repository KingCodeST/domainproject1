package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.person.StudentInfo;

public class StudentInfoFactory {

    public  static StudentInfo getStudentInfo()
    {
        return  new StudentInfo();
    }



}
