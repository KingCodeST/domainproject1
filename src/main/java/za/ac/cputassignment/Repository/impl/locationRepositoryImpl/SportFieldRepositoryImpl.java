package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Set;

public class SportFieldRepositoryImpl implements SportFieldRepository {

    private static SportFieldRepositoryImpl repository =null;
    private Set<SportField> sportFields;


    private static SportFieldRepository getResitory()
    {
        if(repository==null) repository =new SportFieldRepositoryImpl();
        return repository;
    }


    @Override
    public Set<SportField> getAll() {

        return this.sportFields;
    }

    @Override
    public SportField create(SportField sportField) {
        this.sportFields.add(sportField);
        return sportField;
    }

    @Override
    public SportField update(SportField sportField) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public SportField read(String s) {
        return null;
    }
}
