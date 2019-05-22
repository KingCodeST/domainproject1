package za.ac.cputassignment.Controller.personController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.person.DriverInfor;
import za.ac.cputassignment.service.service.PersonService.DriverInforService;

import java.util.Set;

@RestController
@RequestMapping("/BusDriverInfor")
public class BusDriverInforController {



    @Autowired
    @Qualifier("ServiceImpl")
    private DriverInforService service;


    @PostMapping("/create")
    @ResponseBody
    public DriverInfor create(DriverInfor busDriverInfor)
    {
        return service.create(busDriverInfor);
    }

    @PostMapping("/update")
    @ResponseBody
    public DriverInfor update(DriverInfor vDriverInfor)
    {
        return service.update(vDriverInfor);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<DriverInfor> getAll()
    {
        return service.getAll();
    }




}
