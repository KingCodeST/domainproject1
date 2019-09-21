package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.personRepository.StudentInforRepository;
import za.ac.cputassignment.domain.person.StudentInfo;

import java.util.*;
@Repository("InMemory")
public class StudentInforRepositoryImpl implements StudentInforRepository {

    private static StudentInforRepositoryImpl repository=null;
    private Map<String,StudentInfo> studentInfos;

    private StudentInforRepositoryImpl()
    {
        this.studentInfos =new HashMap<>();
    }

    public static StudentInforRepository getRepository()
    {
        if(repository ==null )repository =new StudentInforRepositoryImpl();
        return repository;
    }



    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        this.studentInfos.put(studentInfo.getStudentId(),studentInfo);
        return studentInfo;
    }

    @Override
    public StudentInfo read(String s) {
        return this.studentInfos.get(s);
    }


    @Override
    public StudentInfo update(StudentInfo studentInfo) {

        this.studentInfos.replace(studentInfo.getStudentId(),studentInfo);
        return this.studentInfos.get(studentInfo.getStudentId());
    }

    @Override
    public void delete(String s) {
        this.studentInfos.remove(s);
    }


    @Override
    public Set<StudentInfo> getAll() {
        Collection<StudentInfo>studentInfos=this.studentInfos.values();
        Set<StudentInfo> set =new HashSet<>();
        set.addAll(studentInfos);
        return set;
    }

}
