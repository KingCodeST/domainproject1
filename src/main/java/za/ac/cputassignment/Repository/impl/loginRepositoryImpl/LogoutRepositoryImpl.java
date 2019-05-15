package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.domain.login.Logout;

import java.util.*;
@Repository("InMemory")
public class LogoutRepositoryImpl implements LogoutRepository {

   private static LogoutRepositoryImpl repository =null;
   private Map<String,Logout> logouts;

   private LogoutRepositoryImpl()
   {
       this.logouts = new HashMap<>();
   }



   public static LogoutRepository getRepository()
   {
       if(repository ==null) repository =new LogoutRepositoryImpl();
       return repository;
   }


    @Override
    public Logout create(Logout logout) {
        this.logouts.put(logout.getId(),logout);
        return logout;
    }

    @Override
    public Logout update(Logout logout) {
       this.logouts.replace(logout.getId(),logout);
       return this.logouts.get(logout.getId());
    }

    @Override
    public void delete(String s) {
        this.logouts.remove(s);
    }

    @Override
    public Logout read(String s) {
       return  this.logouts.get(s);
    }

    @Override
    public Set<Logout> getAll() {
        Collection<Logout> logouts=this.logouts.values();
        Set<Logout> set=new HashSet<>();
        set.addAll(logouts);
        return set;
    }

}
