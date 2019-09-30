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
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.DriverFactory;
import za.ac.cputassignment.service.person.impl.DriverServiceImpl;

@RestController
@RequestMapping("/domainproject1/driver")
public class DriverController {

//    @Autowired
//    DriverServiceImpl driverService;
//
//    @PostMapping(value = "/create/{driver}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String driverbus)
//    {
//        System.out.println("Entered Value: "+driverbus);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"driver created!");
//        Driver saveDriver = null;
//        if(driverbus == null|| driverbus.trim().isEmpty()||driverbus.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a driver!");
//        }else{
//            saveDriver = driverService.retrieveByDesc(driverbus);
//        }if (saveDriver !=null){
//        logEvent.setResponseDescription("driver already exist");
//    }else {
//        saveDriver = DriverFactory.BuilderGeneric(driverbus);
//        saveDriver =driverService.create(saveDriver);
//    }
//        logEvent.setResponse(saveDriver);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
