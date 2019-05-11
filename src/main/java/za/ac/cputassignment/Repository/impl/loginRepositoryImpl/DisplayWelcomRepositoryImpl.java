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

   private DisplayWelcom findWelco(String wel)
   {
       return this.displayWelcoms.stream()
                                .filter(displayWelcom -> displayWelcom.getId().trim().equals(wel))
                                .findAny()
                                .orElse(null);
   }

   public static DisplayWelcomRepository getRepository()
   {
       if(repository ==null) repository=new DisplayWelcomRepositoryImpl();
       return repository;
   }



    @Override
    public DisplayWelcom create(DisplayWelcom displayWelcom) {
       this.displayWelcoms.add(displayWelcom);
       return displayWelcom;
    }
    @Override
    public DisplayWelcom read(String s) {
        DisplayWelcom displayWelcom =findWelco(s);
       return displayWelcom;
    }

    @Override
    public DisplayWelcom update(DisplayWelcom displayWelcom) {
       DisplayWelcom displayWelcom1=findWelco(displayWelcom.getId());
       if(displayWelcom1 !=null)
       {
           this.displayWelcoms.remove(displayWelcom1);
           return create(displayWelcom);
       }
       return null;
    }

    @Override
    public void delete(String s) {
       DisplayWelcom displayWelcom =findWelco(s);
       if(displayWelcom !=null)this.displayWelcoms.remove(displayWelcom);

    }

    @Override
    public Set<DisplayWelcom> getAll() {
        return this.displayWelcoms;
    }



}
