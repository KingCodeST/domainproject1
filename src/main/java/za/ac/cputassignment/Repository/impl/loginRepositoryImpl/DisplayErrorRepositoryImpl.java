package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.domain.login.DisplayError;

import java.util.HashSet;
import java.util.Set;

public class DisplayErrorRepositoryImpl implements DisplayErrorRepository {

    private static DisplayErrorRepositoryImpl repository=null;
    private Set<DisplayError> displayErrors;

    private DisplayErrorRepositoryImpl()
    {
        this.displayErrors =new HashSet<>();
    }

    private DisplayError findDisplaye(String displaId)
    {
        return this.displayErrors.stream()
                                .filter(displayError -> displayError.getId().trim().equals(displaId))
                                .findAny()
                                .orElse(null);
    }

    public static DisplayErrorRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new DisplayErrorRepositoryImpl();
        return repository;
    }



    @Override
    public DisplayError create(DisplayError displayError) {
        this.displayErrors.add(displayError);
        return displayError;
    }
    @Override
    public DisplayError read(String s) {
        DisplayError displayError =findDisplaye(s);
        return displayError;
    }

    @Override
    public DisplayError update(DisplayError displayError) {
        DisplayError displayError1 =findDisplaye(displayError.getId());
        if(displayError1 !=null)
        {
            this.displayErrors.remove(displayError1);
            return create(displayError);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        DisplayError displayError=findDisplaye(s);
        if(displayError !=null)this.displayErrors.remove(displayError);

    }

    @Override
    public Set<DisplayError> getAll() {
        return this.displayErrors;
    }



}
