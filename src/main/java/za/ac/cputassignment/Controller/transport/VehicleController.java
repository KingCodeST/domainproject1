package za.ac.cputassignment.Controller.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.transport.*;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.BusInforFactory;
import za.ac.cputassignment.factory.transport.VanVehicleFactory;
import za.ac.cputassignment.factory.transport.VehicleFactory;
import za.ac.cputassignment.service.transport.impl.*;

@RestController
@RequestMapping("/domainproject1/vehicle")
public class VehicleController {

//    @Autowired
//    private VanServiceImpl vanService;
//
//    @Autowired
//    private DiskLicenseServiceImpl diskLicenseService;
//
//    @Autowired
//    private BusServiceImpl busService;
//
//    @Autowired
//    private BusInforServiceImpl busInforService;
//
//    @Autowired
//    private VanVehicleServiceImpl vanVehicleService;
//
//    @Autowired
//    VehicleServiceImpl vehicleService;
//
//    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createVehicle(@RequestBody Vehicle vehicle)
//    {
//        System.out.println(vehicle);
//        LogEvent logEvent = LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"Vehicle created");
//        if (vehicle.getCapacity() ==null || vehicle.getTypeVehicle() == null){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Please provide name of car and/or engine! ");
//        }else {
//            Bus bus=getBus(vehicle);
//            Van van=getVan(vehicle);
//            DiskLicense diskLicense=getDisklicense(vehicle);
//            if (van ==null || bus ==null || diskLicense ==null){
//                logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//                String message =bus ==null ? "Bus not Found|":"";
//                message += van == null ? "van Not found|": "";
//                logEvent.setResponseDescription(message);
//            }else {
//                Vehicle saveVehicle =saveVehicle(vehicle);
//          //      BusInfor savedBusInfo=saveBusInfor(saveVehicle,bus);
//           //     VanVehicle saveVanVehicle=saveVanVehicle(saveVehicle,van);
//                logEvent.setResponse(saveVehicle);
//            }
//
//        }
//        return ResponseEntity.ok(logEvent);
//    }
//
//    private BusInfor saveBusInfor(Vehicle saveVehicle,BusInfor busInfor)
//    {
//        BusInfor busInfor1 = BusInforFactory.BuilderGeneric(saveVehicle.getVehicleId(),busInfor.getVehicleBusId());
//        return busInforService.create(busInfor1);
//    }
//
//    private VanVehicle saveVanVehicle(Vehicle savedVehicle,VanVehicle vanVehicle){
//        VanVehicle vanVehicle1 = VanVehicleFactory.BuilderGeneric(savedVehicle.getVehicleId(),vanVehicle.getVehicleVan());
//        return vanVehicleService.create(vanVehicle1);
//    }
//
//    private Vehicle saveVehicle(Vehicle vehicle)
//    {
//        Vehicle vehi= VehicleFactory.BuilderGeneric(vehicle.getCapacity(),vehicle.getTypeVehicle(),vehicle.getDisklicense());
//        return vehicleService.create(vehi);
//    }
//
//    private Van getVan(Vehicle vehicle){
//        return vanService.retrieveByDesc(vehicle.getTypeVehicle());
//    }
//
//    private Bus getBus(Vehicle vehicle) {
//        return busService.retrieveByDesc(vehicle.getTypeVehicle());
//    }
//
//    private DiskLicense getDisklicense(Vehicle vehicle)
//    {
//        return diskLicenseService.retrieveByDesc(vehicle.getTypeVehicle());
//    }

}
