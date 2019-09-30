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
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.transport.DiskLicenseFactory;
import za.ac.cputassignment.service.transport.impl.DiskLicenseServiceImpl;

@RestController
@RequestMapping("/domainproject1/disklicense")
public class DiskLicenseController {

//    @Autowired
//    DiskLicenseServiceImpl disklicenseService;
//
//    @PostMapping(value = "/create/{diskLicense}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String diskLicense)
//    {
//        System.out.println("Entered Value: "+diskLicense);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"diskLicense created!");
//        DiskLicense saveDisklicense = null;
//        if(diskLicense == null|| diskLicense.trim().isEmpty()||diskLicense.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a diskLicense!");
//        }else{
//            saveDisklicense = disklicenseService.retrieveByDesc(diskLicense);
//        }if (saveDisklicense !=null){
//        logEvent.setResponseDescription("diskLicense already exist");
//    }else {
//        saveDisklicense = DiskLicenseFactory.BuilderGeneric(diskLicense);
//        saveDisklicense =disklicenseService.create(saveDisklicense);
//    }
//        logEvent.setResponse(saveDisklicense);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
