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
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.BusFactory;
import za.ac.cputassignment.service.transport.impl.BusServiceImpl;

@RestController
@RequestMapping("/domainproject1/bus")
public class BusController {

//    @Autowired
//    BusServiceImpl busService;
//
//    @PostMapping(value = "/create/{bus}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String bus)
//    {
//        System.out.println("Entered Value: "+bus);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"bus created!");
//        Bus saveBus = null;
//        if(bus == null|| bus.trim().isEmpty()||bus.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a bus!");
//        }else{
//            saveBus = busService.retrieveByDesc(bus);
//        }if (saveBus !=null){
//        logEvent.setResponseDescription("bus already exist");
//    }else {
//        saveBus = BusFactory.getBus(bus);
//        saveBus =busService.create(saveBus);
//    }
//        logEvent.setResponse(saveBus);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
