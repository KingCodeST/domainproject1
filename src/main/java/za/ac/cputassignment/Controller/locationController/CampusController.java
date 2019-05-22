package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.service.LocationService.CampusService;

import java.util.Set;

@RestController
@RequestMapping("/Campus")
public class CampusController {



    @Autowired
    @Qualifier("ServiceImpl")
    private CampusService service;


    @PostMapping("/create")
    @ResponseBody
    public Campus create(Campus campus)
    {
        return service.create(campus);
    }

    @PostMapping("/update")
    @ResponseBody
    public Campus update(Campus campus)
    {
        return service.update(campus);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Campus> getAll()
    {
        return service.getAll();
    }







}
