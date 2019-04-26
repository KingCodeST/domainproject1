package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.domain.login.DisplayError;

import java.util.Set;

public class DisplayErrorRepositoryImpl implements DisplayErrorRepository {

    private static DisplayErrorRepositoryImpl repository=null;
    private Set<DisplayError> displayErrors;

    private DisplayErrorRepositoryImpl getRepository()
    {
        if(repository ==null) repository=new DisplayErrorRepositoryImpl();
        return repository;
    }


    @Override
    public Set<DisplayError> getAll() {
        return this.displayErrors;
    }

    @Override
    public DisplayError create(DisplayError displayError) {
        this.displayErrors.add(displayError);
        return displayError;
    }

    @Override
    public DisplayError update(DisplayError displayError) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DisplayError read(String s) {
        return null;
    }
}
