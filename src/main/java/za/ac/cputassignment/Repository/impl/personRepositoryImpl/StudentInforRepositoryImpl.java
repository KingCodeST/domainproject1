package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.HashSet;
import java.util.Set;

public class StudentInforRepositoryImpl implements StudentInforRepository {

    private static StudentInforRepositoryImpl repository=null;
    private Set<StudentInfo> studentInfos;

    private StudentInforRepositoryImpl()
    {
        this.studentInfos =new HashSet<>();
    }

    public  StudentInforRepository getRepository()
    {
        if(repository ==null )repository =new StudentInforRepositoryImpl();
        return repository;
    }

    @Override
    public Set<StudentInfo> getAll() {
        return this.studentInfos;
    }

    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        this.studentInfos.add(studentInfo);
        return studentInfo;
    }

    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public StudentInfo read(String s) {
        return null;
    }
}
