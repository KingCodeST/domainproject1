package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentRepository;

import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.person.StudentService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService  {

    private static StudentService studentService= null;

    @Autowired
    private StudentRepository studentRepository;

    private StudentServiceImpl() {
    }

    public static StudentService getVehicleService(){
        if (studentService ==null) studentService=new StudentServiceImpl();
        return studentService;
    }

    @Override
    public Student retrieveByDesc(String vehicleDesc) {
        List<Student> campusLocations= getAll();
        for(Student campusRepository: campusLocations)
        {
            if (campusRepository.getFirstname().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student create(Student campusRepository) {

        return this.studentRepository.save(campusRepository);
    }

    @Override
    public Student read(String s) {
        Optional<Student> optVehicle =this.studentRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Student update(Student campusRepository) {
        return this.studentRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.studentRepository.deleteById(s);
    }

}

