package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.login.Login;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {

    Set<Login>getAll();

}
