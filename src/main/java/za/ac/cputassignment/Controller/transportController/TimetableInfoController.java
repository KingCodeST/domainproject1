package za.ac.cputassignment.Controller.transportController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;
import za.ac.cputassignment.service.service.TransportService.TimetableInfoService;

import java.util.Set;

@RestController
@RequestMapping("/TimetableInfo")
public class TimetableInfoController {



    @Autowired
    @Qualifier("ServiceImpl")
    private TimetableInfoService service;


    @PostMapping("/create")
    @ResponseBody
    public TimetableInfo create(TimetableInfo timeT)
    {
        return service.create(timeT);
    }

    @PostMapping("/update")
    @ResponseBody
    public TimetableInfo update(TimetableInfo timeT)
    {
        return service.update(timeT);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<TimetableInfo> getAll()
    {
        return service.getAll();
    }






}
