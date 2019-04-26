package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayWelcom;

import java.util.HashSet;
import java.util.Set;

public class DisplayWelcomRepositoryImpl implements DisplayWelcomRepository {

   private static DisplayWelcomRepositoryImpl repository =null;
   private Set<DisplayWelcom> displayWelcoms;

   private DisplayWelcomRepositoryImpl()
   {
       this.displayWelcoms =new HashSet<>();
   }


   public static DisplayWelcomRepository getRepository()
   {
       if(repository ==null) repository=new DisplayWelcomRepositoryImpl();
       return repository;
   }


    @Override
    public Set<DisplayWelcom> getAll() {
        return this.displayWelcoms;
    }

    @Override
    public DisplayWelcom create(DisplayWelcom displayWelcom) {
       this.displayWelcoms.add(displayWelcom);
       return displayWelcom;
    }

    @Override
    public DisplayWelcom update(DisplayWelcom displayWelcom) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DisplayWelcom read(String s) {
        return null;
    }
}
