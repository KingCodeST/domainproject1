package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.domain.login.DisplayError;

import java.util.*;

public class DisplayErrorRepositoryImpl implements DisplayErrorRepository {

    private static DisplayErrorRepositoryImpl repository=null;
    private Map<String,DisplayError> displayErrors;

    private DisplayErrorRepositoryImpl()
    {
        this.displayErrors =new HashMap<>();
    }



    public static DisplayErrorRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new DisplayErrorRepositoryImpl();
        return repository;
    }



    @Override
    public DisplayError create(DisplayError displayError) {
        this.displayErrors.put(displayError.getId(),displayError);
        return displayError;
    }
    @Override
    public DisplayError read(String s) {
     return   this.displayErrors.get(s);
    }

    @Override
    public DisplayError update(DisplayError displayError) {
       this.displayErrors.replace(displayError.getId(),displayError);
       return this.displayErrors.get(displayError.getId());
    }

    @Override
    public void delete(String s) {
       this.displayErrors.remove(s);
    }

    @Override
    public Set<DisplayError> getAll() {
        Collection<DisplayError> displayErrors=this.displayErrors.values();
        Set<DisplayError> set =new HashSet<>();
        set.addAll(displayErrors);
        return set;
    }



}
