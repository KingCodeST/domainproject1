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

    private StudentInfo findstunt(String stId)
    {
        return this.studentInfos.stream().filter(studentInfo -> studentInfo.getId().trim().equals(stId))
                                        .findAny()
                                        .orElse(null);
    }


    @Override
    public StudentInfo create(StudentInfo studentInfo) {
        this.studentInfos.add(studentInfo);
        return studentInfo;
    }

    @Override
    public StudentInfo read(String s) {
        StudentInfo studentInfo =findstunt(s);
        return studentInfo;
    }


    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        StudentInfo studentInfo1 =findstunt(studentInfo.getId());
        if(studentInfo1 !=null)
        {
            this.studentInfos.remove(studentInfo1);
            return create(studentInfo);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        StudentInfo studentInfo =findstunt(s);
        if(studentInfo !=null) this.studentInfos.remove(studentInfo);
    }


    @Override
    public Set<StudentInfo> getAll() {
        return this.studentInfos;
    }

}
