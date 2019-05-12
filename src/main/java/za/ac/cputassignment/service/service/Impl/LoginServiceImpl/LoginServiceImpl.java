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
        return this.repository.getAll();
    }

    @Override
    public Login create(Login login) {
        return this.repository.create(login);
    }

    @Override
    public Login read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Login update(Login login) {
        return this.repository.update(login);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
