package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.DisplayErrorRepositoryImpl;
import za.ac.cputassignment.Repository.loginRepository.DisplayErrorRepository;
import za.ac.cputassignment.service.service.LoginService.DisplayErrorService;

import java.util.Set;

@Service("ServiceImpl")
public class DisplayErrorServiceImpl implements DisplayErrorService {

    @Autowired
    @Qualifier
    private DisplayErrorRepository repository;

    private DisplayErrorServiceImpl()
    {
        this.repository = DisplayErrorRepositoryImpl.getRepository();
    }



    @Override
    public Set<DisplayError> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DisplayError create(DisplayError displayError) {
        return this.repository.create(displayError);
    }

    @Override
    public DisplayError read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DisplayError update(DisplayError displayError) {
        return this.repository.update(displayError);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
