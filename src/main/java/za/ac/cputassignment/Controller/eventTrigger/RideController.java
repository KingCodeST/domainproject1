package za.ac.cputassignment.Controller.eventTrigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.eventTrigger.RideFactory;
import za.ac.cputassignment.service.eventTrigger.impl.RideServiceImpl;
import za.ac.cputassignment.service.eventTrigger.impl.RideStatusServiceImpl;


@RestController
@RequestMapping("/domainproject1/ride")
public class RideController {

    
}
