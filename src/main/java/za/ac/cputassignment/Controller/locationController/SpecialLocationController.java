package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.service.LocationService.SpecialLocationService;

import java.util.Set;

@RestController
@RequestMapping("/SpecialLocation")
public class SpecialLocationController {



    @Autowired
    @Qualifier("ServiceImpl")
    private SpecialLocationService service;


    @PostMapping("/create")
    @ResponseBody
    public SpecialLocation create(SpecialLocation specialLocation)
    {
        return service.create(specialLocation);
    }

    @PostMapping("/update")
    @ResponseBody
    public SpecialLocation update(SpecialLocation specialLocation)
    {
        return service.update(specialLocation);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<SpecialLocation> getAll()
    {
        return service.getAll();
    }





}
