package za.ac.cputassignment.Controller.eventTriggerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.service.service.eventTriggerService.RideService;

import java.util.Set;

@RestController
@RequestMapping("/Ride")
public class RideController {



    @Autowired
 //   @Qualifier("ServiceImpl")
    private RideService service;


    @PostMapping("/create")
    @ResponseBody
    public Ride create(Ride ride)
    {
        return service.create(ride);
    }

    @PostMapping("/update")
    @ResponseBody
    public Ride update(Ride ride)
    {
        return service.update(ride);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Ride> getAll()
    {
        return service.getAll();
    }







}
