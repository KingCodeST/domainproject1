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
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.BusInforFactory;
import za.ac.cputassignment.service.transport.impl.BusInforServiceImpl;

@RestController
@RequestMapping("/domainproject1/busInfor")
public class BusInforController {

//    @Autowired
//    BusInforServiceImpl busInfoService;
//
//    @PostMapping(value = "/create/{busInfo}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String busInfo)
//    {
//        System.out.println("Entered Value: "+busInfo);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"busInfo created!");
//        BusInfor saveBusInfo = null;
//        if(busInfo == null|| busInfo.trim().isEmpty()||busInfo.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a busInfo!");
//        }else{
//            saveBusInfo = busInfoService.retrieveByDesc(busInfo);
//        }if (saveBusInfo !=null){
//        logEvent.setResponseDescription("busInfo already exist");
//    }else {
//        saveBusInfo = BusInforFactory.BuilderGeneric(busInfo);
//        saveBusInfo =busInfoService.create(saveBusInfo);
//    }
//        logEvent.setResponse(saveBusInfo);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
