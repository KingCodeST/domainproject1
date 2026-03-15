package za.ac.cputassignment.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = {"", "/"})
    public ResponseEntity<Map<String, String>> home() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to Student Shuttles API");
        response.put("version", "1.0.0");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<Map<String, String>> student() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome Student");
        response.put("role", "USER");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<Map<String, String>> admin() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome Admin");
        response.put("role", "ADMIN");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
