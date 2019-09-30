package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldRepository;
import za.ac.cputassignment.Repository.location.impl.SportFieldRepositoryImpl;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.location.SportFieldService;

import java.util.Set;


public class SportFieldServiceImpl implements SportFieldService {


    private static SportFieldServiceImpl service=null;
    private SportFieldRepository repository;

    private SportFieldServiceImpl(){
        this.repository = SportFieldRepositoryImpl.getRepository();
    }

    public static SportFieldServiceImpl getService(){
        if(service ==null) service =new SportFieldServiceImpl();
        return service;
    }



    @Override
    public Set<SportField> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SportField create(SportField sportFieldLocation) {

        return this.repository.create(sportFieldLocation);
    }

    @Override
    public SportField read(String s) {
        return this.repository.read(s);
    }

    @Override
    public SportField update(SportField sportFieldLocation) {
        return this.repository.update(sportFieldLocation);
    }

    public SportField retrieveByDesc(String colors) {
        Set<SportField> sportFields = getAll();
        for (SportField sportField : sportFields) {
            if (sportField.getAddress().equalsIgnoreCase(colors)) return sportField;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
