package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.DisplayWelcomRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.domain.login.DisplayWelcom;
import za.ac.cputassignment.service.service.LoginService.DisplayWelcomService;

import java.util.Set;

@Service("ServiceImpl")
public class DisplayWelcomServiceImpl implements DisplayWelcomService {

    @Autowired
    @Qualifier
    private DisplayWelcomRepository repository;


    private  DisplayWelcomServiceImpl()
    {
        this.repository = DisplayWelcomRepositoryImpl.getRepository();
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
