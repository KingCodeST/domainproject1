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
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.eventTrigger.RideFactory;
import za.ac.cputassignment.service.eventTrigger.impl.RideServiceImpl;
import za.ac.cputassignment.service.eventTrigger.impl.RideStatusServiceImpl;


@RestController
@RequestMapping("/domainproject1/ride")
public class RideController {
//
//    @Autowired
//    RideServiceImpl rideStatusService;
//
//    @PostMapping(value = "/create/{alertinfor}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String rides)
//    {
//        System.out.println("Entered Value: "+rides);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"ArletInfor created!");
//        Ride savedRide = null;
//        if(rides == null|| rides.trim().isEmpty()||rides.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a Alertinfor!");
//        }else{
//            savedRide = rideStatusService.retrieveByDesc(rides);
//        }if (savedRide !=null){
//        logEvent.setResponseDescription("Arlet already exist");
//    }else {
//        savedRide = RideFactory.GenericBuilder(rides);
//        savedRide =rideStatusService.create(savedRide);
//    }
//        logEvent.setResponse(savedRide);
//
//        return ResponseEntity.ok(logEvent);
//    }
    
}
