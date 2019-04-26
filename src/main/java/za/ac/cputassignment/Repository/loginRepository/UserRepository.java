package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.login.User;

import java.util.Set;

public interface UserRepository extends IRepository<User,String> {

    Set<User>getAll();

}
