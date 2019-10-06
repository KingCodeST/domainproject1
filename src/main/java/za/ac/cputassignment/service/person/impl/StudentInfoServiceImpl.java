package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentInfoRepository;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.person.StudentInfoService;

import java.util.List;
import java.util.Set;


public class StudentInfoServiceImpl implements StudentInfoService{


    @Override
    public StudentInfo retrieveByDesc(String studentInfoDesc) {
        return null;
    }

    @Override
    public List<StudentInfo> getAll() {
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

