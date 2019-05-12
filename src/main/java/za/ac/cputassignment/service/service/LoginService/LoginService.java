package za.ac.cputassignment.service.service.LoginService;

import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
