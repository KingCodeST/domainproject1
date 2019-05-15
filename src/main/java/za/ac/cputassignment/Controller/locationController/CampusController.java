package za.ac.cputassignment.Controller.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.service.service.LocationService.CampusService;

@RestController
@RequestMapping("/Campus")
public class CampusController {

    @Autowired
    private CampusService service;
   


}
