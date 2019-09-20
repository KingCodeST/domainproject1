package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;

import java.util.Set;

public interface DisplayErrorRepository extends IRepository<DisplayError,String> {

    Set<DisplayError>getAll();
}
