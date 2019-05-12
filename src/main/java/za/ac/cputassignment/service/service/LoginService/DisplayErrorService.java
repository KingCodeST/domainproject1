package za.ac.cputassignment.service.service.LoginService;

import za.ac.cputassignment.domain.login.DisplayError;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface DisplayErrorService extends IService<DisplayError,String> {
    Set<DisplayError> getAll();
}
