package za.ac.cputassignment.Controller.transportController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.service.TransportService.BusInforService;

import java.util.Set;

@RestController
@RequestMapping("/BusInfor")
public class BusInforController {



    @Autowired
    @Qualifier("ServiceImpl")
    private BusInforService service;


    @PostMapping("/create")
    @ResponseBody
    public BusInfor create(BusInfor busI)
    {
        return service.create(busI);
    }

    @PostMapping("/update")
    @ResponseBody
    public BusInfor update(BusInfor busI)
    {
        return service.update(busI);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<BusInfor> getAll()
    {
        return service.getAll();
    }






}
