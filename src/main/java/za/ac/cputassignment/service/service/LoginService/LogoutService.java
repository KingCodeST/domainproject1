package za.ac.cputassignment.service.service.LoginService;

import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface LogoutService extends IService<Logout,String> {
    Set<Logout> getAll();
}
