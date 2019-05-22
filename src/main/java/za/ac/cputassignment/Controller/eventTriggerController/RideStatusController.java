package za.ac.cputassignment.Controller.eventTriggerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.service.eventTriggerService.RideStatusService;

import java.util.Set;

@RestController
@RequestMapping("/RideStatus")
public class RideStatusController {



    @Autowired
    @Qualifier("ServiceImpl")
    private RideStatusService service;


    @PostMapping("/create")
    @ResponseBody
    public RideStatus create(RideStatus ridestatus)
    {
        return service.create(ridestatus);
    }

    @PostMapping("/update")
    @ResponseBody
    public RideStatus update(RideStatus ridestatus)
    {
        return service.update(ridestatus);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<RideStatus> getAll()
    {
        return service.getAll();
    }






}
