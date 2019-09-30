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
import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.GenderFactory;
import za.ac.cputassignment.service.person.impl.GenderServiceImpl;

@RestController
@RequestMapping("/domainproject1/gender")
public class GenderController {

//    @Autowired
//    GenderServiceImpl genderService;
//
//    @PostMapping(value = "/create/{gender}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String driverlicense)
//    {
//        System.out.println("Entered Value: "+driverlicense);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"gender created!");
//        Gender saveGender = null;
//        if(driverlicense == null|| driverlicense.trim().isEmpty()||driverlicense.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a gender!");
//        }else{
//            saveGender = genderService.retrieveByDesc(driverlicense);
//        }if (saveGender !=null){
//        logEvent.setResponseDescription("gender already exist");
//    }else {
//        saveGender = GenderFactory.GenericBuilder(driverlicense);
//        saveGender =genderService.create(saveGender);
//    }
//        logEvent.setResponse(saveGender);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
