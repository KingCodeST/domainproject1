package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.StudentInfoRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.Set;

@Repository("InMemory")
public class StudentInfoRepositoryImpl implements StudentInfoRepository {
    @Override
    public Set<StudentInfo> getAll() {
        return null;
    }

    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        return null;
    }

    @Override
    public StudentInfo read(String s) {
        return null;
    }

    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
