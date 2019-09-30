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
import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.DriverBusFactory;
import za.ac.cputassignment.service.person.impl.DriverBusServiceImpl;

@RestController
@RequestMapping("/domainproject1/driverbus")
public class DriverBusController {

//    @Autowired
//    DriverBusServiceImpl driverbusService;
//
//    @PostMapping(value = "/create/{driverbus}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String driverbus)
//    {
//        System.out.println("Entered Value: "+driverbus);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"driverbus created!");
//        DriverBus saveDriverBus = null;
//        if(driverbus == null|| driverbus.trim().isEmpty()||driverbus.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a driverbus!");
//        }else{
//            saveDriverBus = driverbusService.retrieveByDesc(driverbus);
//        }if (saveDriverBus !=null){
//        logEvent.setResponseDescription("driverbus already exist");
//    }else {
//        saveDriverBus = DriverBusFactory.GenericBuilder(driverbus);
//        saveDriverBus =driverbusService.create(saveDriverBus);
//    }
//        logEvent.setResponse(saveDriverBus);
//
//        return ResponseEntity.ok(logEvent);
//    }
//
}
