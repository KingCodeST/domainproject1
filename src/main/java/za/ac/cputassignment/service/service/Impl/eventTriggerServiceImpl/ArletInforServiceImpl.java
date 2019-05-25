  package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.service.eventTriggerService.ArletInforService;

import java.util.Set;

@Service("ServiceImpl")
public class ArletInforServiceImpl implements ArletInforService {


    @Autowired
  //  @Qualifier
    private ArletInforRepository repository;

    private ArletInforServiceImpl() {
        this.repository = ArletInforRepositoryImpl.getRepository();
    }


    @Override
    public Set<ArletInfor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {

        return this.repository.create(arletInfor);
    }

    @Override
    public ArletInfor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return this.repository.update(arletInfor);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
