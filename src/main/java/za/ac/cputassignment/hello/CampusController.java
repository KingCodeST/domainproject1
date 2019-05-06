package za.ac.cputassignment.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.domain.location.Campus;

import java.util.Arrays;
import java.util.List;

@RestController
public class CampusController {



    @RequestMapping("/campus")
    public List<ArletInfor> getAllCampus()
    {
        return Arrays.asList(
                new ArletInfor("Bluee","Bluer","Greye","er"),
                new ArletInfor("gray","Black","Fire","Orange"),
                new ArletInfor("Brown","Bluer","Greye","Green"),
                new ArletInfor("bage","Bluer","Light","Brown"),
                new ArletInfor("Bewon","Bluer","Just","For Control")
        );
    }





}
