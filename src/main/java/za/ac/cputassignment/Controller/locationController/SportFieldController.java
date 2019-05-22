package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.service.LocationService.SportFieldService;

import java.util.Set;

@RestController
@RequestMapping("/SportField")
public class SportFieldController {



    @Autowired
    @Qualifier("ServiceImpl")
    private SportFieldService service;


    @PostMapping("/create")
    @ResponseBody
    public SportField create(SportField sportField)
    {
        return service.create(sportField);
    }

    @PostMapping("/update")
    @ResponseBody
    public SportField update(SportField sportField)
    {
        return service.update(sportField);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<SportField> getAll()
    {
        return service.getAll();
    }






}
