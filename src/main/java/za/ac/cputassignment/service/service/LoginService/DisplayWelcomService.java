package za.ac.cputassignment.service.service.LoginService;

import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface DisplayWelcomService extends IService<DisplayWelcom,String> {
    Set<DisplayWelcom> getAll();
}
