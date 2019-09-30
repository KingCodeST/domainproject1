package za.ac.cputassignment.Controller.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.StudentInfoFactory;
import za.ac.cputassignment.service.person.impl.StudentInfoServiceImpl;

@RestController
@RequestMapping("/domainproject1/studentinfo")
public class StudentInfoController {

//    @Autowired
//    StudentInfoServiceImpl studentInforService;
//
//    @PostMapping(value = "/create/{studentInfo}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String studentInfo)
//    {
//        System.out.println("Entered Value: "+studentInfo);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"studentInfo created!");
//        StudentInfo saveStudentInfo = null;
//        if(studentInfo == null|| studentInfo.trim().isEmpty()||studentInfo.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a studentInfo!");
//        }else{
//            saveStudentInfo = studentInforService.retrieveByDesc(studentInfo);
//        }if (saveStudentInfo !=null){
//        logEvent.setResponseDescription("studentInfo already exist");
//    }else {
//        saveStudentInfo = StudentInfoFactory.GenericBuilder(studentInfo);
//        saveStudentInfo =studentInforService.create(saveStudentInfo);
//    }
//        logEvent.setResponse(saveStudentInfo);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
