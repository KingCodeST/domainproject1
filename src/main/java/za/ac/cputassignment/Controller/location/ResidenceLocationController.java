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
import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.service.location.impl.ResidenceLocationServiceImpl;

@RestController
@RequestMapping("/domainproject1/residencelocation")
public class ResidenceLocationController {

//    @Autowired
//    ResidenceLocationServiceImpl residenceLocationService;
//
//    @PostMapping(value = "/create/{location}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"location created!");
//        ResidenceLocation saveLocation = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a location!");
//        }else{
//            saveLocation = residenceLocationService.retrieveByDesc(campuslocation);
//        }if (saveLocation !=null){
//        logEvent.setResponseDescription("location already exist");
//    }else {
//      //  saveLocation =ResidenceLocat.GenericBuilder(campuslocation);
//        saveLocation =residenceLocationService.create(saveLocation);
//    }
//        logEvent.setResponse(saveLocation);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
