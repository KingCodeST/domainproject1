package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.domain.login.Logout;

import java.util.HashSet;
import java.util.Set;

public class LogoutRepositoryImpl implements LogoutRepository {

   private static LogoutRepositoryImpl repository =null;
   private Set<Logout> logouts;

   private LogoutRepositoryImpl()
   {
       this.logouts = new HashSet<>();
   }

   public static LogoutRepository getRepository()
   {
       if(repository ==null) repository =new LogoutRepositoryImpl();
       return repository;
   }

    @Override
    public Set<Logout> getAll() {
        return this.logouts;
    }

    @Override
    public Logout create(Logout logout) {
        this.logouts.add(logout);
        return logout;
    }

    @Override
    public Logout update(Logout logout) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Logout read(String s) {
        return null;
    }
}
