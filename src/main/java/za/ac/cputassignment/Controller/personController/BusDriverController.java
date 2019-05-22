package za.ac.cputassignment.Controller.personController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.service.service.PersonService.BusDriverService;

import java.util.Set;

@RestController
@RequestMapping("/BusDriver")
public class BusDriverController {



    @Autowired
    @Qualifier("ServiceImpl")
    private BusDriverService service;


    @PostMapping("/create")
    @ResponseBody
    public BusDriver create(BusDriver busDriver)
    {
        return service.create(busDriver);
    }

    @PostMapping("/update")
    @ResponseBody
    public BusDriver update(BusDriver busDriver)
    {
        return service.update(busDriver);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<BusDriver> getAll()
    {
        return service.getAll();
    }






}
