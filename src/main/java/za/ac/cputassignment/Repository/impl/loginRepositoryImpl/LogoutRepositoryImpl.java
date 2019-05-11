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

   private Logout findLogout(String ouId)
   {
       return this.logouts.stream().filter(logout -> logout.getId().trim().equals(ouId))
                                    .findAny()
                                    .orElse(null);
   }

   public static LogoutRepository getRepository()
   {
       if(repository ==null) repository =new LogoutRepositoryImpl();
       return repository;
   }


    @Override
    public Logout create(Logout logout) {
        this.logouts.add(logout);
        return logout;
    }

    @Override
    public Logout update(Logout logout) {
       Logout logout1 =findLogout(logout.getId());
       if(logout1 !=null)
       {
           this.logouts.remove(logout1);
           return create(logout);
       }
       return null;
    }

    @Override
    public void delete(String s) {
        Logout logout =findLogout(s);
        if(logout !=null) this.logouts.remove(logout);
    }

    @Override
    public Logout read(String s) {
       Logout logout=findLogout(s);
       return logout;
    }

    @Override
    public Set<Logout> getAll() {
        return this.logouts;
    }

}
