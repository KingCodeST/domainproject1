package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.trasportRepositoryImpl.VanRepositoryImpl;
import za.ac.cputassignment.Repository.trasportRepository.VanRepository;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.service.TransportService.VanService;

import java.util.Set;

@Service
public class VanServiceImpl implements VanService {

    private static VanServiceImpl service=null;
    private VanRepository repository;

    private VanServiceImpl()
    {
        this.repository = VanRepositoryImpl.getRepository();
    }

    public static VanServiceImpl getService()
    {
        if(service ==null) service =new VanServiceImpl();
        return service;
    }

    @Override
    public Set<Van> getAll() {
        return null;
    }

    @Override
    public Van create(Van van) {
        return null;
    }

    @Override
    public Van read(String s) {
        return null;
    }

    @Override
    public Van update(Van van) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
