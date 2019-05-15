package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;

import java.util.*;

public class LoginResitoryImpl implements LoginRepository {

    private static LoginResitoryImpl resitory=null;
    private Map<String,Login> logins;

    private LoginResitoryImpl()
    {
        this.logins =new HashMap<>();
    }



    public static LoginRepository getRepository()
    {
        if(resitory ==null)resitory =new LoginResitoryImpl();
        return resitory;
    }



    @Override
    public Login create(Login login) {
        this.logins.put(login.getLoginId(),login);
        return login;
    }
    @Override
    public Login read(String s) {
       return this.logins.get(s);
    }

    @Override
    public Login update(Login login) {
       this.logins.replace(login.getLoginId(),login);
       return this.logins.get(login.getLoginId());
    }

    @Override
    public void delete(String s) {
       this.logins.remove(s);
    }



    @Override
    public Set<Login> getAll() {
        Collection<Login> logins=this.logins.values();
        Set<Login> set =new HashSet<>();
        set.addAll(logins);
        return set;
    }

}
