package za.ac.cputassignment.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.ArletinforService;

import java.util.Arrays;
import java.util.List;

@RestController
public class CampusController {

    @Autowired
    private ArletinforService services;

    @RequestMapping("/campus")
    public List<ArletInfor> getAllCampus()
    {
        return services.gettAllArlets();
    }

    @RequestMapping("/campus/{id}")
    public ArletInfor getArlet(@PathVariable String id)
    {
        return services.getArlets(id);
    }






}
