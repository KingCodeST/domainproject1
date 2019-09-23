package za.ac.cputassignment.service.person.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.service.person.GenderService;

import java.util.Set;

@Service("serviceImpl")
public class GenderServiceImpl implements GenderService {
    @Override
    public Set<Gender> getAll() {
        return null;
    }

    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(String s) {
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
