package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.login.Logout;

import java.util.Set;

public interface LogoutRepository extends IRepository<Logout,String> {
    Set<Logout>getAll();

}
