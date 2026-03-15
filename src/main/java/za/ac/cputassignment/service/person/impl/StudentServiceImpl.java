package za.ac.cputassignment.service.person.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.person.StudentRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.person.StudentService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student retrieveByDesc(String studentFirstname) {
        logger.debug("Retrieving student by firstname: {}", studentFirstname);
        Optional<Student> student = studentRepository.findByFirstname(studentFirstname);
        
        if (student.isEmpty()) {
            logger.warn("Student not found with firstname: {}", studentFirstname);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Student not found with firstname: " + studentFirstname
            );
        }
        return student.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAll() {
        logger.debug("Fetching all students");
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        if (student == null) {
            logger.error("Cannot create null student");
            throw new IllegalArgumentException("Student cannot be null");
        }
        logger.info("Creating new student: {}", student.getStudentNum());
        return studentRepository.save(student);
    }

    @Override
    @Transactional(readOnly = true)
    public Student read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Student ID cannot be null or empty");
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }
        logger.debug("Reading student with id: {}", id);
        Optional<Student> student = studentRepository.findById(id);
        
        if (student.isEmpty()) {
            logger.warn("Student not found with id: {}", id);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Student not found with id: " + id
            );
        }
        return student.get();
    }

    @Override
    public Student update(Student student) {
        if (student == null || student.getId() == null) {
            logger.error("Cannot update null student or student without ID");
            throw new IllegalArgumentException("Student and ID cannot be null");
        }
        logger.info("Updating student with id: {}", student.getId());
        return studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Student ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }
        logger.info("Deleting student with id: {}", id);
        studentRepository.deleteById(id);
    }

}

