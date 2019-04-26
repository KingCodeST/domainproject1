package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;

import java.util.HashSet;
import java.util.Set;

public class LoginResitoryImpl implements LoginRepository {

    private static LoginResitoryImpl resitory=null;
    private Set<Login> logins;

    private LoginResitoryImpl()
    {
        this.logins =new HashSet<>();
    }

    private static LoginRepository getRepository()
    {
        if(resitory ==null)resitory =new LoginResitoryImpl();
        return resitory;
    }


    @Override
    public Set<Login> getAll() {
        return this.logins;
    }

    @Override
    public Login create(Login login) {
        this.logins.add(login);
        return login;
    }

    @Override
    public Login update(Login login) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Login read(String s) {
        return null;
    }
}
