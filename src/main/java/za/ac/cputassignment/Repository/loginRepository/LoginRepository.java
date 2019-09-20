package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {

    Set<Login>getAll();

}
