package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.StudentInfo;

public class StudentInfoFactory {

    public  static StudentInfo getStudentInfo(String StidId,String addr)
    {
        return  new StudentInfo.Builder()
                                .id(StidId)
                                .address(addr)
                                .build();
    }



}
