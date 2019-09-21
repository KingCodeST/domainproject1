package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.*;
@Repository("InMemory")
public class SportFieldRepositoryImpl implements SportFieldRepository {

   private static  SportFieldRepositoryImpl repository =null;
   private Map<String,SportField> sportFieldSet;


   private SportFieldRepositoryImpl()
   {
       this.sportFieldSet =new HashMap<>();
   }


   public static SportFieldRepositoryImpl getRepository()
   {
       if(repository ==null) repository =new SportFieldRepositoryImpl();
       return repository;
   }



    @Override
    public SportField create(SportField sportField) {
      this.sportFieldSet.put(sportField.getAddress(),sportField);
      return sportField;
    }

    @Override
    public SportField read(String s) {
        return this.sportFieldSet.get(s);
    }

    @Override
    public void delete(String s) {
        this.sportFieldSet.remove(s);
    }

    @Override
    public SportField update(SportField sportField) {
        this.sportFieldSet.replace(sportField.getAddress(),sportField);
        return this.sportFieldSet.get(sportField.getAddress());
    }

    @Override
    public Set<SportField> getAll() {
        Collection<SportField> sportFields=this.sportFieldSet.values();
        Set<SportField> set=new HashSet<>();
        set.addAll(sportFields);
        return set;
    }
}
