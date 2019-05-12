package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.DisplayErrorRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayError;
import za.ac.cputassignment.service.service.LoginService.DisplayErrorService;

import java.util.Set;

@Service
public class DisplayErrorServiceImpl implements DisplayErrorService {

    private static DisplayErrorServiceImpl service=null;
    private DisplayErrorRepository repository;

    private DisplayErrorServiceImpl()
    {
        this.repository = DisplayErrorRepositoryImpl.getRepository();
    }

    public static DisplayErrorServiceImpl getService()
    {
        if(service == null) service =new DisplayErrorServiceImpl();
        return service;
    }

    @Override
    public Set<DisplayError> getAll() {
        return null;
    }

    @Override
    public DisplayError create(DisplayError displayError) {
        return null;
    }

    @Override
    public DisplayError read(String s) {
        return null;
    }

    @Override
    public DisplayError update(DisplayError displayError) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
