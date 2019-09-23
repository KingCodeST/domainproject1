package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.person.StudentInforService;

import java.util.Set;

@Service("serviceImpl")
public class StudentInforServiceImpl implements StudentInforService {
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
