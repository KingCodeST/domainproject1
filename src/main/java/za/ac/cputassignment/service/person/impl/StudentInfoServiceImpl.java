package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentInfoRepository;
import za.ac.cputassignment.Repository.person.impl.StudentInfoRepositoryImpl;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.person.StudentInfoService;

import java.util.Set;


public class StudentInfoServiceImpl implements StudentInfoService {



    private static StudentInfoServiceImpl service=null;
    private StudentInfoRepository repository;

    private StudentInfoServiceImpl(){
        this.repository = StudentInfoRepositoryImpl.getRepository();
    }

    public static StudentInfoServiceImpl getService(){
        if(service ==null) service =new StudentInfoServiceImpl();
        return service;
    }



    @Override
    public Set<StudentInfo> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StudentInfo create(StudentInfo objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public StudentInfo read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StudentInfo update(StudentInfo objectEntity) {
        return this.repository.update(objectEntity);
    }

    public StudentInfo retrieveByDesc(String colors) {
        Set<StudentInfo> studentInfo = getAll();
        for (StudentInfo studentInfos : studentInfo) {
            if (studentInfos.getStudentNumber().equalsIgnoreCase(colors)) return studentInfos;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

