package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.location.CampusLocationService;

import java.util.Set;

@Service("serviceImpl")
public class CampusLocationServiceImpl implements CampusLocationService {
    @Override
    public Set<CampusLocation> getAll() {
        return null;
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {
        return null;
    }

    @Override
    public CampusLocation read(String s) {
        return null;
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
