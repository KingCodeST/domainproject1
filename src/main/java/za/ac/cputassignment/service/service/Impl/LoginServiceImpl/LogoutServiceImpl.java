package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.LogoutRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.domain.login.Logout;
import za.ac.cputassignment.service.service.LoginService.LogoutService;

import java.util.Set;

@Service("ServiceImpl")
public class LogoutServiceImpl implements LogoutService {

    @Autowired
    @Qualifier

    private LogoutRepository repository;

    private LogoutServiceImpl()
    {
        this.repository = LogoutRepositoryImpl.getRepository();
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
