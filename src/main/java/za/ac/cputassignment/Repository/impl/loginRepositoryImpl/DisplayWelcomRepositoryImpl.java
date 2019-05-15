package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayWelcom;

import java.util.*;

public class DisplayWelcomRepositoryImpl implements DisplayWelcomRepository {

   private static DisplayWelcomRepositoryImpl repository =null;
   private Map<String,DisplayWelcom> displayWelcoms;



   private DisplayWelcomRepositoryImpl()
   {
       this.displayWelcoms =new HashMap<>();
   }



   public static DisplayWelcomRepository getRepository()
   {
       if(repository ==null) repository=new DisplayWelcomRepositoryImpl();
       return repository;
   }



    @Override
    public DisplayWelcom create(DisplayWelcom displayWelcom) {
       this.displayWelcoms.put(displayWelcom.getId(),displayWelcom);
       return displayWelcom;
    }
    @Override
    public DisplayWelcom read(String s) {
      return this.displayWelcoms.get(s);
    }

    @Override
    public DisplayWelcom update(DisplayWelcom displayWelcom) {
      this.displayWelcoms.replace(displayWelcom.getId(),displayWelcom);
      return displayWelcoms.get(displayWelcom);
    }

    @Override
    public void delete(String s) {
      this.displayWelcoms.get(s);
    }

    @Override
    public Set<DisplayWelcom> getAll() {
        Collection<DisplayWelcom> displayWelcoms =this.displayWelcoms.values();
        Set<DisplayWelcom> set =new HashSet<>();
        set.addAll(displayWelcoms);
        return set;
    }



}
