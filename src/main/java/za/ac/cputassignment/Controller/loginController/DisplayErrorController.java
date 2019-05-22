package za.ac.cputassignment.Controller.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.login.DisplayError;
import za.ac.cputassignment.service.service.LoginService.DisplayErrorService;

import java.util.Set;

@RestController
@RequestMapping("/DisplayError")
public class DisplayErrorController {



    @Autowired
    @Qualifier("ServiceImpl")
    private DisplayErrorService service;


    @PostMapping("/create")
    @ResponseBody
    public DisplayError create(DisplayError displayError)
    {
        return service.create(displayError);
    }

    @PostMapping("/update")
    @ResponseBody
    public DisplayError update(DisplayError displayError)
    {
        return service.update(displayError);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<DisplayError> getAll()
    {
        return service.getAll();
    }





}
