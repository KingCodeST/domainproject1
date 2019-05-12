package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.DisplayWelcomRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayWelcom;
import za.ac.cputassignment.service.service.LoginService.DisplayWelcomService;

import java.util.Set;

@Service
public class DisplayWelcomServiceImpl implements DisplayWelcomService {

    private static DisplayWelcomServiceImpl service=null;
    private DisplayWelcomRepository repository;


    private  DisplayWelcomServiceImpl()
    {
        this.repository = DisplayWelcomRepositoryImpl.getRepository();
    }

    public static DisplayWelcomServiceImpl getService()
    {
        if(service ==null) service=new DisplayWelcomServiceImpl();
        return service;
    }

    @Override
    public Set<DisplayWelcom> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DisplayWelcom create(DisplayWelcom displayWelcom) {
        return this.repository.create(displayWelcom);
    }

    @Override
    public DisplayWelcom read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DisplayWelcom update(DisplayWelcom displayWelcom) {
        return this.repository.update(displayWelcom);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
