package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.login.Authentication;

import java.util.Set;

public interface AuthenticationRepository extends IRepository<Authentication,String>
{

    Set<Authentication>getAll();

}
