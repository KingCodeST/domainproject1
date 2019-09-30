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
import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.CampusFactory;
import za.ac.cputassignment.factory.location.CampusLocationFactory;
import za.ac.cputassignment.service.location.impl.CampusLocationServiceImpl;

@RestController
@RequestMapping("/domainproject1/campuslocation")
public class CampusLocationController {

//    @Autowired
//    CampusLocationServiceImpl campuslocationService;
//
//    @PostMapping(value = "/create/{campuslocation}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"campuslocation created!");
//        CampusLocation saveCampuslocation = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a campuslocation!");
//        }else{
//            saveCampuslocation = campuslocationService.retrieveByDesc(campuslocation);
//        }if (saveCampuslocation !=null){
//        logEvent.setResponseDescription("campuslocation already exist");
//    }else {
//        saveCampuslocation = CampusLocationFactory.GenericBuilder(campuslocation);
//        saveCampuslocation =campuslocationService.create(saveCampuslocation);
//    }
//        logEvent.setResponse(saveCampuslocation);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
