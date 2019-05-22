package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.service.LocationService.ResidenceService;

import java.util.Set;

@RestController
@RequestMapping("/Residence")
public class ResidenceController {



    @Autowired
    @Qualifier("ServiceImpl")
    private ResidenceService service;


    @PostMapping("/create")
    @ResponseBody
    public Residence create(Residence residence)
    {
        return service.create(residence);
    }

    @PostMapping("/update")
    @ResponseBody
    public Residence update(Residence residence)
    {
        return service.update(residence);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Residence> getAll()
    {
        return service.getAll();
    }







}
