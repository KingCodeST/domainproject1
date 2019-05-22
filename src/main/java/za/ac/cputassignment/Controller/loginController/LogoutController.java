package za.ac.cputassignment.Controller.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.login.Logout;
import za.ac.cputassignment.service.service.LoginService.LogoutService;

import java.util.Set;

@RestController
@RequestMapping("/Logout")
public class LogoutController {



    @Autowired
    @Qualifier("ServiceImpl")
    private LogoutService service;


    @PostMapping("/create")
    @ResponseBody
    public Logout create(Logout logout)
    {
        return service.create(logout);
    }

    @PostMapping("/update")
    @ResponseBody
    public Logout update(Logout logout)
    {
        return service.update(logout);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Logout> getAll()
    {
        return service.getAll();
    }





}
