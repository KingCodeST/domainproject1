package za.ac.cputassignment.Controller.location;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.LogEvent;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.eventTrigger.LogEventFactory;
import za.ac.cputassignment.factory.location.CampusFactory;
import za.ac.cputassignment.service.location.impl.CampusServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/domainproject1/campus")
public class CampusController {

    @Autowired
    CampusServiceImpl campusService;

    @PostMapping("/create")
    public Campus create(@RequestBody Campus campus)
    {
        return this.campusService.create(campus);
    }

    @GetMapping("/read")
    public Campus read(@PathVariable String s)
    {
        return this.campusService.read(s);
    }

    @PutMapping("/update")
    public Campus update(@RequestBody Campus campus)
    {
        return this.campusService.update(campus);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable String id)
    {
        this.campusService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Campus>getAll()
    {
        return this.campusService.getAll();
    }





}
