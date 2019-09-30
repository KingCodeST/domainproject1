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
import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.SpecialLocationLFactory;
import za.ac.cputassignment.service.location.impl.SpecialLocationLServiceImpl;

@RestController
@RequestMapping("/domainproject1/speicalll")
public class SpecialLocationLController {

//    @Autowired
//    SpecialLocationLServiceImpl spllocationService;
//
//    @PostMapping(value = "/create/{speicalll}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String campuslocation)
//    {
//        System.out.println("Entered Value: "+campuslocation);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"speicalll created!");
//        SpecialLocationL savedsplocation = null;
//        if(campuslocation == null|| campuslocation.trim().isEmpty()||campuslocation.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a speicalll!");
//        }else{
//            savedsplocation = spllocationService.retrieveByDesc(campuslocation);
//        }if (savedsplocation !=null){
//        logEvent.setResponseDescription("speicalll already exist");
//    }else {
//        savedsplocation = SpecialLocationLFactory.getSportField(campuslocation);
//        savedsplocation =spllocationService.create(savedsplocation);
//    }
//        logEvent.setResponse(savedsplocation);
//
//        return ResponseEntity.ok(logEvent);
//    }
//
}
