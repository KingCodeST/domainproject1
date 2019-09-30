package za.ac.cputassignment.Controller.eventTrigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.eventTrigger.RideStatusFactory;
import za.ac.cputassignment.service.eventTrigger.impl.RideStatusServiceImpl;

@RestController
@RequestMapping("/domainproject1/ridestatus")
public class RideStatusController {

//    @Autowired
//    RideStatusServiceImpl rideStatusService;
//
//    @PostMapping(value = "/create/{ridestatus}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String ridestatus)
//    {
//        System.out.println("Entered Value: "+ridestatus);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"RideStatus created!");
//        RideStatus savedRStatus = null;
//        if(ridestatus == null|| ridestatus.trim().isEmpty()||ridestatus.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a RideStatus!");
//        }else{
//            savedRStatus = rideStatusService.retrieveByDesc(ridestatus);
//        }if (savedRStatus !=null){
//        logEvent.setResponseDescription("rideStatus already exist");
//    }else {
//        savedRStatus = RideStatusFactory.GenericBuilder(ridestatus);
//        savedRStatus =rideStatusService.create(savedRStatus);
//    }
//        logEvent.setResponse(savedRStatus);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
