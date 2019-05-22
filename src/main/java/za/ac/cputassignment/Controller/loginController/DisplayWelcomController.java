package za.ac.cputassignment.Controller.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.login.DisplayWelcom;
import za.ac.cputassignment.service.service.LoginService.DisplayWelcomService;

import java.util.Set;

@RestController
@RequestMapping("/DisplayWelcom")
public class DisplayWelcomController {



    @Autowired
    @Qualifier("ServiceImpl")
    private DisplayWelcomService service;


    @PostMapping("/create")
    @ResponseBody
    public DisplayWelcom create(DisplayWelcom displayWelcom)
    {
        return service.create(displayWelcom);
    }

    @PostMapping("/update")
    @ResponseBody
    public DisplayWelcom update(DisplayWelcom displayWelcom)
    {
        return service.update(displayWelcom);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<DisplayWelcom> getAll()
    {
        return service.getAll();
    }





}
