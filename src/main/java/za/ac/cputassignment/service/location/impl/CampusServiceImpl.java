package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.CampusRepository;
import za.ac.cputassignment.Repository.location.impl.CampusRepositoryImpl;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.location.CampusService;

import java.util.Set;


public class CampusServiceImpl implements CampusService {


    private static CampusServiceImpl service=null;
    private CampusRepository repository;

    private CampusServiceImpl(){
        this.repository = CampusRepositoryImpl.getRepository();
    }

    public static CampusServiceImpl getService(){
        if(service ==null) service =new CampusServiceImpl();
        return service;
    }



    @Override
    public Set<Campus> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Campus create(Campus campus) {

        return this.repository.create(campus);
    }

    @Override
    public Campus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Campus update(Campus campus) {
        return this.repository.update(campus);
    }

    public Campus retrieveByDesc(String colors) {
        Set<Campus> campuss = getAll();
        for (Campus campus : campuss) {
            if (campus.getName().equalsIgnoreCase(colors)) return campus;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}