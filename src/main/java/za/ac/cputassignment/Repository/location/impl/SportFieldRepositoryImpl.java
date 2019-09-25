package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class SportFieldRepositoryImpl implements SportFieldRepository {

    private static SportFieldRepositoryImpl repository =null;
    private Set<SportField> sportFieldset;

    private SportFieldRepositoryImpl(){
        this.sportFieldset =new HashSet<>();
    }

    private SportField findArletInfor(String sportFieldId)
    {
        return this.sportFieldset.stream()
                .filter(sportField -> sportField.getsFieldID().trim().equals(sportFieldId))
                .findAny()
                .orElse(null);
    }

    public static SportFieldRepositoryImpl getRepository(){
        if(repository ==null) repository=new SportFieldRepositoryImpl();
        return repository;
    }

    @Override
    public Set<SportField> getAll() {
        return this.sportFieldset;
    }

    @Override
    public SportField create(SportField sportFieldOb) {
        this.sportFieldset.add(sportFieldOb);
        return sportFieldOb;
    }

    @Override
    public SportField read(String sportFieldId) {
        SportField sportFieldOb=findArletInfor(sportFieldId);
        return sportFieldOb;
    }

    @Override
    public SportField update(SportField sportFieldOb) {
        SportField toDelete =findArletInfor(sportFieldOb.getsFieldID());
        if(toDelete !=null)
        {
            this.sportFieldset.remove(toDelete);
            return create(sportFieldOb);
        }
        return null;
    }

    @Override
    public void delete(String sportFieldId) {
        SportField sportFieldOb=findArletInfor(sportFieldId);
        if (sportFieldOb !=null) this.sportFieldset.remove(sportFieldOb);

    }
}
