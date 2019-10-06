package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface SportFieldService extends IService<SportField,String> {
    SportField retrieveByDesc(String sportFieldDesc);
    List<SportField> getAll();

}
