package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.StudentInfo;

public class StudentInfoFactory {

    public  static StudentInfo getStudentInfo()
    {
        return  new StudentInfo();
    }



}
