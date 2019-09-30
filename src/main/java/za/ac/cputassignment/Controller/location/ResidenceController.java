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
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.ResidenceFactory;
import za.ac.cputassignment.service.location.impl.ResidenceServiceImpl;

@RestController
@RequestMapping("/domainproject1/residence")
public class ResidenceController {
//
//    @Autowired
//    ResidenceServiceImpl residenceService;
//
//    @PostMapping(value = "/create/{residence}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String residence)
//    {
//        System.out.println("Entered Value: "+residence);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"residence created!");
//        Residence saveLocation = null;
//        if(residence == null|| residence.trim().isEmpty()||residence.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a residence!");
//        }else{
//            saveLocation = residenceService.retrieveByDesc(residence);
//        }if (saveLocation !=null){
//        logEvent.setResponseDescription("residence already exist");
//    }else {
//        saveLocation = ResidenceFactory.getResidence(residence);
//        saveLocation =residenceService.create(saveLocation);
//    }
//        logEvent.setResponse(saveLocation);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
