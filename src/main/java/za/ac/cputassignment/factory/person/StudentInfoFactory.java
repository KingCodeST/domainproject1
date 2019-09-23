package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.StudentInfo;

public class StudentInfoFactory {

    public static StudentInfo GenericBuilder(String studentNumber,String studentId)
    {
        return new StudentInfo(studentId,studentNumber);

    }


}
