package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SportFieldRepositoryImpl implements SportFieldRepository {

   private static  SportFieldRepositoryImpl repository =null;
   private Set<SportField> sportFieldSet;


   private SportFieldRepositoryImpl()
   {
       this.sportFieldSet =new HashSet<>();
   }


   public static SportFieldRepositoryImpl getRepository()
   {
       if(repository ==null) repository =new SportFieldRepositoryImpl();
       return repository;
   }

   private SportField findSportfield(String sId)
   {
       return this.sportFieldSet.stream()
                                .filter(sportField -> sportField.getId().trim().equals(sId))
                                .findAny()
                                .orElse(null);
   }




    @Override
    public SportField create(SportField sportField) {
        return null;
    }

    @Override
    public SportField read(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public SportField update(SportField sportField) {
        return null;
    }

    @Override
    public Set<SportField> getAll() {
        return null;
    }
}
