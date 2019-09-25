package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.util.Misc;

public class StudentInfoFactory {

    public static StudentInfo GenericBuilder(String studentNumber,String studentId)
    {
        return new StudentInfo(Misc.generatedId(),studentNumber);

    }


}
