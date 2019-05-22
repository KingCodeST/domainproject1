package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.location.LocationInfor;
import za.ac.cputassignment.service.service.LocationService.LocationInforService;

import java.util.Set;

@RestController
@RequestMapping("/LocationInfor")
public class LocationInforController {



    @Autowired
    @Qualifier("ServiceImpl")
    private LocationInforService service;


    @PostMapping("/create")
    @ResponseBody
    public LocationInfor create(LocationInfor locationInfor)
    {
        return service.create(locationInfor);
    }

    @PostMapping("/update")
    @ResponseBody
    public LocationInfor update(LocationInfor locationInfor)
    {
        return service.update(locationInfor);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<LocationInfor> getAll()
    {
        return service.getAll();
    }






}
