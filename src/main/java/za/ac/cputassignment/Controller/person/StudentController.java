package za.ac.cputassignment.Controller.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.person.*;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.StudentFactory;
import za.ac.cputassignment.service.person.impl.*;

import java.util.Set;

@RestController
@RequestMapping("/domainproject1/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(value = "/create/{member}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMember(@PathVariable String member){
        System.out.println(member);
        LogEvent responseObj = LogEventFactory.BuildGenericResponseObj((HttpStatus.OK.toString(), "Member created!");
        String  student;
        if (member == null || member.trim().isEmpty() || member.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide member!");
        } else {
            student = studentService.retrieveByDesc(student);
            if (student != null) {
                responseObj.setResponseDescription("Member already exist!");
            } else {
                student = String.valueOf(StudentFactory.getStudent(member));
                student = studentService.create(student);
            }
            responseObj.setResponse(student);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        LogEvent responseObj = LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Student> members = studentService.getAll();
        responseObj.setResponse(members);
        return ResponseEntity.ok(responseObj);
    }




}
