package za.ac.cputassignment.Controller.transportController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.service.TransportService.BusService;

import java.util.Set;

@RestController
@RequestMapping("/Bus")
public class BusController {



    @Autowired
    @Qualifier("ServiceImpl")
    private BusService service;


    @PostMapping("/create")
    @ResponseBody
    public Bus create(Bus bus)
    {
        return service.create(bus);
    }

    @PostMapping("/update")
    @ResponseBody
    public Bus update(Bus bus)
    {
        return service.update(bus);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Bus> getAll()
    {
        return service.getAll();
    }






}
