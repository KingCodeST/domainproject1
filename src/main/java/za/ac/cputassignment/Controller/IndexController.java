package za.ac.cputassignment.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = {"/","/domainproject1"})
 //   @ResponseBody
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("welcome to HG app!", HttpStatus.OK);
    }

}
