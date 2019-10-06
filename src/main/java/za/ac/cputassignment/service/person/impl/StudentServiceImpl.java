package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.StudentRepository;

import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.person.StudentService;

import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService  {


    @Override
    public Student retrieveByDesc(String studentDesc) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student read(String s) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

