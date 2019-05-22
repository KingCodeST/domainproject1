package za.ac.cputassignment.Controller.transportController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.service.TransportService.VanService;

import java.util.Set;

@RestController
@RequestMapping("/Van")
public class VanController {



    @Autowired
    @Qualifier("ServiceImpl")
    private VanService service;


    @PostMapping("/create")
    @ResponseBody
    public Van create(Van van)
    {
        return service.create(van);
    }

    @PostMapping("/update")
    @ResponseBody
    public Van update(Van van)
    {
        return service.update(van);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Van> getAll()
    {
        return service.getAll();
    }


    


}
