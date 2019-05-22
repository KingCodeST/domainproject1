package za.ac.cputassignment.Controller.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.service.service.LoginService.LoginService;

import java.util.Set;

@RestController
@RequestMapping("/Login")
public class LoginController {



    @Autowired
    @Qualifier("ServiceImpl")
    private LoginService service;


    @PostMapping("/create")
    @ResponseBody
    public Login create(Login login)
    {
        return service.create(login);
    }

    @PostMapping("/update")
    @ResponseBody
    public Login update(Login login)
    {
        return service.update(login);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Login> getAll()
    {
        return service.getAll();
    }






}
