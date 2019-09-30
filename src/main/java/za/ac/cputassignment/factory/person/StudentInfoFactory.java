package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.util.Misc;

public class StudentInfoFactory {
    private static String studentNumber, studentId;
    public static StudentInfo GenericBuilder(String studentInfo)
    {
        return new StudentInfo(Misc.generatedId(),studentNumber);

    }


}
