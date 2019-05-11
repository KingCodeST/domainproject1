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

    private Login findLongin(String logId)
    {
        return this.logins.stream()
                            .filter(login -> login.getLoginId().trim().equals(logId))
                            .findAny()
                            .orElse(null);
    }

    private static LoginRepository getRepository()
    {
        if(resitory ==null)resitory =new LoginResitoryImpl();
        return resitory;
    }



    @Override
    public Login create(Login login) {
        this.logins.add(login);
        return login;
    }
    @Override
    public Login read(String s) {
       Login login =findLongin(s);
        return login;
    }

    @Override
    public Login update(Login login) {
        Login  login1=findLongin(login.getLoginId());
        if(login1 !=null)
        {
            this.logins.remove(login1);
            return create(login);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Login login =findLongin(s);
        if(login !=null)  this.logins.remove(login);
    }



    @Override
    public Set<Login> getAll() {
        return this.logins;
    }

}
