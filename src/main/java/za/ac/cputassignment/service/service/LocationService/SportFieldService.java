package za.ac.cputassignment.service.service.LocationService;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface SportFieldService extends IService<SportField,String> {
    Set<SportField> getAll();
}
