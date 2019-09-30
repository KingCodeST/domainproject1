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
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.SportFieldFactory;
import za.ac.cputassignment.service.location.impl.SportFieldServiceImpl;

@RestController
@RequestMapping("/domainproject1/sportfield")
public class SportFieldController {

//    @Autowired
//    SportFieldServiceImpl sportFieldService;
//
//    @PostMapping(value = "/create/{sportfield}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"sportfield created!");
//        SportField saveSportField = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a sportfield!");
//        }else{
//            saveSportField = sportFieldService.retrieveByDesc(campuslocation);
//        }if (saveSportField !=null){
//        logEvent.setResponseDescription("sportfield already exist");
//    }else {
//        saveSportField = SportFieldFactory.getSportField(campuslocation);
//        saveSportField =sportFieldService.create(saveSportField);
//    }
//        logEvent.setResponse(saveSportField);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
