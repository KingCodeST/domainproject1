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
import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.VanVehicleFactory;
import za.ac.cputassignment.service.transport.impl.VanVehicleServiceImpl;

@RestController
@RequestMapping("/domainproject1/vanvehicle")
public class VanVehicleController {

//    @Autowired
//    VanVehicleServiceImpl vanVehicleService;
//
//    @PostMapping(value = "/create/{vanVehicle}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String vanVehicle)
//    {
//        System.out.println("Entered Value: "+vanVehicle);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"vanVehicle created!");
//        VanVehicle saveVanVehicle = null;
//        if(vanVehicle == null|| vanVehicle.trim().isEmpty()||vanVehicle.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a vanVehicle!");
//        }else{
//            saveVanVehicle = vanVehicleService.retrieveByDesc(vanVehicle);
//        }if (saveVanVehicle !=null){
//        logEvent.setResponseDescription("vanVehicle already exist");
//    }else {
//        saveVanVehicle = VanVehicleFactory.BuilderGeneric(vanVehicle);
//        saveVanVehicle =vanVehicleService.create(saveVanVehicle);
//    }
//        logEvent.setResponse(saveVanVehicle);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
