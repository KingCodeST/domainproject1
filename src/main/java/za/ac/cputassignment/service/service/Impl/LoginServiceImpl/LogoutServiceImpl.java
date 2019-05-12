package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.LogoutRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.domain.login.Logout;
import za.ac.cputassignment.service.service.LoginService.LogoutService;

import java.util.Set;

@Service
public class LogoutServiceImpl implements LogoutService {

    private static LogoutServiceImpl service=null;
    private LogoutRepository repository;

    private LogoutServiceImpl()
    {
        this.repository = LogoutRepositoryImpl.getRepository();
    }

    public static LogoutServiceImpl getService()
    {
        if(service ==null) service =new LogoutServiceImpl();
        return  service;
    }

    @Override
    public Set<Logout> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Logout create(Logout logout) {
        return this.repository.create(logout);
    }

    @Override
    public Logout read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Logout update(Logout logout) {
        return this.repository.update(logout);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
