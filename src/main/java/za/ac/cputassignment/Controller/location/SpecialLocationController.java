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
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.SpecialLocationFactory;
import za.ac.cputassignment.service.location.impl.SpecialLocationServiceImpl;

@RestController
@RequestMapping("/domainproject1/speciallocation")
public class SpecialLocationController {

//    @Autowired
//    SpecialLocationServiceImpl specialLocationService;
//
//    @PostMapping(value = "/create/{speciallocation}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"speciallocation created!");
//        SpecialLocation savedsplocation = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a speciallocation!");
//        }else{
//            savedsplocation = specialLocationService.retrieveByDesc(campuslocation);
//        }if (savedsplocation !=null){
//        logEvent.setResponseDescription("speciallocation already exist");
//    }else {
//        savedsplocation = SpecialLocationFactory.getSpecialFactory(campuslocation);
//        savedsplocation =specialLocationService.create(savedsplocation);
//    }
//        logEvent.setResponse(savedsplocation);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
