package za.ac.cputassignment.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
public class IndexController {

    @RequestMapping(value = {"/","/domainproject1"})
 //   @ResponseBody
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("welcome to HG app!", HttpStatus.OK);
    }

    @GetMapping("/student")
    public String student(){
        return ("<h1> Welcome Student</h1>");
    }

    @GetMapping("/admin")
    public  String admin()
    {
        return ("<h1> Welcome Admin </h1>");
    }




}
