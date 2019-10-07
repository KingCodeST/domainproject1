package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentInfoRepository;

import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.person.StudentInfoService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class StudentInfoServiceImpl implements StudentInfoService{

    private static StudentInfoService studentInfoService= null;

    @Autowired
    private StudentInfoRepository studentInfoRepository;

    private StudentInfoServiceImpl() {
    }

    public static StudentInfoService getVehicleService(){
        if (studentInfoService ==null) studentInfoService=new StudentInfoServiceImpl();
        return studentInfoService;
    }

    @Override
    public StudentInfo retrieveByDesc(String vehicleDesc) {
        List<StudentInfo> campusLocations= getAll();
        for(StudentInfo campusRepository: campusLocations)
        {
            if (campusRepository.getStudentNumber().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<StudentInfo> getAll() {
        return this.studentInfoRepository.findAll();
    }

    @Override
    public StudentInfo create(StudentInfo campusRepository) {

        return this.studentInfoRepository.save(campusRepository);
    }

    @Override
    public StudentInfo read(String s) {
        Optional<StudentInfo> optVehicle =this.studentInfoRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public StudentInfo update(StudentInfo campusRepository) {
        return this.studentInfoRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.studentInfoRepository.deleteById(s);
    }

}

