package za.ac.cputassignment.Controller.eventTrigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.factory.eventTrigger.ArletInforFactory;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;
import za.ac.cputassignment.service.eventTrigger.impl.ArletInforServiceImpl;

import java.awt.*;
import java.util.Set;

@RestController
@RequestMapping("/domainproject1/lookup/arletinfor")
public class ArletInforController {




}
