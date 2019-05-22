package za.ac.cputassignment.Controller.eventTriggerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.service.eventTriggerService.ArletInforService;

import java.util.Set;

@RestController
@RequestMapping("/AlertInfor")
public class ArletInforController {


    @Autowired
    @Qualifier("ServiceImpl")
    private ArletInforService service;


    @PostMapping("/create")
    @ResponseBody
    public ArletInfor create(ArletInfor arletInfor)
    {
        return service.create(arletInfor);
    }

    @PostMapping("/update")
    @ResponseBody
    public ArletInfor update(ArletInfor arletInfor)
    {
        return service.update(arletInfor);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<ArletInfor> getAll()
    {
        return service.getAll();
    }





}
