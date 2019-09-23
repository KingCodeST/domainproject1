package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.transport.VanService;

import java.util.Set;

@Repository("InMemory")
public class VanRepositoryImpl  implements VanService {
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
