package za.ac.cputassignment.Repository.loginRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;

import java.util.Set;

public interface DisplayWelcomRepository extends IRepository<DisplayWelcom,String> {

    Set<DisplayWelcom>getAll();

}
