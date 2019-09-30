package za.ac.cputassignment.Controller.eventTrigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.factory.eventTrigger.ArletInforFactory;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;
import za.ac.cputassignment.service.eventTrigger.impl.ArletInforServiceImpl;

import java.awt.*;

@RestController
@RequestMapping("/domainproject1/arletinfor")
public class ArletInforController {

//    @Autowired
//    ArletInforServiceImpl arletInforService;
//
//    @PostMapping(value = "/create/{alertinfor}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String arletInfor)
//    {
//        System.out.println("Entered Value: "+arletInfor);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"ArletInfor created!");
//        ArletInfor savedAlertinfor = null;
//        if(arletInfor == null|| arletInfor.trim().isEmpty()||arletInfor.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a Alertinfor!");
//        }else{
//            savedAlertinfor = arletInforService.retrieveByDesc(arletInfor);
//        }if (savedAlertinfor !=null){
//            logEvent.setResponseDescription("Arlet already exist");
//    }else {
//            savedAlertinfor = ArletInforFactory.GenericBuilder(arletInfor);
//            savedAlertinfor =arletInforService.create(savedAlertinfor);
//          }
//        logEvent.setResponse(savedAlertinfor);
//
//       return ResponseEntity.ok(logEvent);
//    }


}
