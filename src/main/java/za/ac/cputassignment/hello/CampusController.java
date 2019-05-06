package za.ac.cputassignment.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.location.Campus;

@RestController
public class CampusController {

    Campus campus;

    @RequestMapping("/campus")
    public String getAllCampus()
    {
        return "all Campus";
    }



}
