package za.ac.cputassignment.Controller.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.VanFactory;
import za.ac.cputassignment.service.transport.impl.VanServiceImpl;

@RestController
@RequestMapping("/domainproject1/van")
public class VanController {

//    @Autowired
//    VanServiceImpl vanService;
//
//    @PostMapping(value = "/create/{van}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String van)
//    {
//        System.out.println("Entered Value: "+van);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"van created!");
//        Van saveVan = null;
//        if(van == null|| van.trim().isEmpty()||van.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a van!");
//        }else{
//            saveVan = vanService.retrieveByDesc(van);
//        }if (saveVan !=null){
//        logEvent.setResponseDescription("van already exist");
//    }else {
//        saveVan = VanFactory.getVan(van);
//        saveVan =vanService.create(saveVan);
//    }
//        logEvent.setResponse(saveVan);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
