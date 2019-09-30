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
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.DriverFactory;
import za.ac.cputassignment.factory.person.DriverLicenseFactory;
import za.ac.cputassignment.service.person.impl.DriverLicenseServiceImpl;

@RestController
@RequestMapping("/domainproject1/driverlicense")
public class DriverLicenseController {

//    @Autowired
//    DriverLicenseServiceImpl driverLicenseService;
//
//    @PostMapping(value = "/create/{driverlicense}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String driverlicense)
//    {
//        System.out.println("Entered Value: "+driverlicense);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"driverlicense created!");
//        DriverLicense saveDriverLicense = null;
//        if(driverlicense == null|| driverlicense.trim().isEmpty()||driverlicense.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a driverlicense!");
//        }else{
//            saveDriverLicense = driverLicenseService.retrieveByDesc(driverlicense);
//        }if (saveDriverLicense !=null){
//        logEvent.setResponseDescription("driverlicense already exist");
//    }else {
//        saveDriverLicense = DriverLicenseFactory.GenericBuilder(driverlicense);
//        saveDriverLicense =driverLicenseService.create(saveDriverLicense);
//    }
//        logEvent.setResponse(saveDriverLicense);
//
//        return ResponseEntity.ok(logEvent);
//    }


}
