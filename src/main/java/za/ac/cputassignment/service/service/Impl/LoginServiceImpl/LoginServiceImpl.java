package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.LoginRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.service.service.LoginService.LoginService;

import java.util.Set;

@Service("ServiceImpl")
public class LoginServiceImpl implements LoginService {

    @Autowired
    @Qualifier

    private LoginRepository repository;

    private LoginServiceImpl()
    {
        this.repository = LoginRepositoryImpl.getRepository();
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
