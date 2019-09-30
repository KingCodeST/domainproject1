package za.ac.cputassignment.Controller.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.person.RaceFactory;
import za.ac.cputassignment.service.person.impl.RaceServiceImpl;

@RestController
@RequestMapping("/domainproject1/race")
public class RaceController {

//    @Autowired
//    RaceServiceImpl raceService;
//
//    @PostMapping(value = "/create/{race}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createArletInfor(@PathVariable String race)
//    {
//        System.out.println("Entered Value: "+race);
//        LogEvent logEvent= LogEventFactory.BuildGenericResponseObj(HttpStatus.OK.toString(),"race created!");
//        Race saveRace = null;
//        if(race == null|| race.trim().isEmpty()||race.equalsIgnoreCase("null")){
//            logEvent.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            logEvent.setResponseDescription("Provide a race!");
//        }else{
//            saveRace = raceService.retrieveByDesc(race);
//        }if (saveRace !=null){
//        logEvent.setResponseDescription("race already exist");
//    }else {
//        saveRace = RaceFactory.GenericBuilder(race);
//        saveRace =raceService.create(saveRace);
//    }
//        logEvent.setResponse(saveRace);
//
//        return ResponseEntity.ok(logEvent);
//    }

}
