package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.StudentInfoRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.HashSet;
import java.util.Set;


public class StudentInfoRepositoryImpl implements StudentInfoRepository {
    
    private static StudentInfoRepositoryImpl repository = null;
    private Set<StudentInfo> studentInfoSet;

    private StudentInfoRepositoryImpl() {
        this.studentInfoSet = new HashSet<>();
    }

    private StudentInfo FindStudentInfoId(String raceId) {
        return this.studentInfoSet.stream()
                .filter(driverBus -> driverBus.getStudentId().trim().equals(raceId))
                .findAny()
                .orElse(null);
    }

    public static StudentInfoRepositoryImpl getRepository() {
        if (repository == null) repository = new StudentInfoRepositoryImpl();
        return repository;
    }

    @Override
    public Set<StudentInfo> getAll() {
        return this.studentInfoSet;
    }

    @Override
    public StudentInfo create(StudentInfo studentInObj) {
        this.studentInfoSet.add(studentInObj);
        return studentInObj;
    }

    @Override
    public StudentInfo read(String residenceLocationID) {
        StudentInfo studentInObj = FindStudentInfoId(residenceLocationID);
        return studentInObj;
    }

    @Override
    public StudentInfo update(StudentInfo studentInObj) {
        StudentInfo toDelete = FindStudentInfoId(studentInObj.getStudentId());
        if (toDelete != null) {
            this.studentInfoSet.remove(toDelete);
            return create(studentInObj);
        }
        return null;
    }

    @Override
    public void delete(String raceId) {
        StudentInfo studentInObj = FindStudentInfoId(raceId);
        if (studentInObj != null) this.studentInfoSet.remove(studentInObj);

    }

}
