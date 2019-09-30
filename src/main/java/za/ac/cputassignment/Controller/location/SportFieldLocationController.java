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
import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.SportFieldLocationFactory;
import za.ac.cputassignment.service.location.impl.SportFieldLocationServiceImpl;

@RestController
@RequestMapping("/domainproject1/sportfieldlocation")
public class SportFieldLocationController {

//    @Autowired
//    SportFieldLocationServiceImpl sportfieldLocationService;
//
//    @PostMapping(value = "/create/{/sportfieldlocation}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"/sportfieldlocation created!");
//        SportFieldLocation saveSportField = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a sportfieldlocation!");
//        }else{
//            saveSportField = sportfieldLocationService.retrieveByDesc(campuslocation);
//        }if (saveSportField !=null){
//        logEvent.setResponseDescription("/sportfieldlocation already exist");
//    }else {
//        saveSportField = SportFieldLocationFactory.getSportField(campuslocation);
//        saveSportField =sportfieldLocationService.create(saveSportField);
//    }
//        logEvent.setResponse(saveSportField);
//
//        return ResponseEntity.ok(logEvent);
//    }


}
