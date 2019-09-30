package za.ac.cputassignment.Controller.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.CampusFactory;
import za.ac.cputassignment.service.location.impl.CampusServiceImpl;

@RestController
@RequestMapping("/domainproject1/campus")
public class CampusController {

//    @Autowired
//    CampusServiceImpl campusService;
//
//    @PostMapping(value = "/create/{campus}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String ridestatus)
//    {
//        System.out.println("Entered Value: "+ridestatus);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"campus created!");
//        Campus savedRStatus = null;
//        if(ridestatus == null|| ridestatus.trim().isEmpty()||ridestatus.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a campus!");
//        }else{
//            savedRStatus = campusService.retrieveByDesc(ridestatus);
//        }if (savedRStatus !=null){
//        logEvent.setResponseDescription("campus already exist");
//    }else {
//        savedRStatus = CampusFactory.GenericBuilder(ridestatus);
//        savedRStatus =campusService.create(savedRStatus);
//    }
//        logEvent.setResponse(savedRStatus);
//
//        return ResponseEntity.ok(logEvent);
//    }
    
}
