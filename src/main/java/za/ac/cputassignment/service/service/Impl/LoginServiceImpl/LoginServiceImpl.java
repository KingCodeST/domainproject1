package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.LoginResitoryImpl;
import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.service.service.LoginService.LoginService;

import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {

    private static LoginServiceImpl service=null;
    private LoginRepository repository;

    private LoginServiceImpl()
    {
        this.repository = LoginResitoryImpl.getRepository();
    }

    public static LoginServiceImpl getService()
    {
        if(service ==null) service =new LoginServiceImpl();
        return service;
    }

    @Override
    public Set<Login> getAll() {
        return null;
    }

    @Override
    public Login create(Login login) {
        return null;
    }

    @Override
    public Login read(String s) {
        return null;
    }

    @Override
    public Login update(Login login) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
