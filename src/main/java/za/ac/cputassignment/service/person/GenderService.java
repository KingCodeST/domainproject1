package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface GenderService extends IService<Gender,String> {
    Gender retrieveByDesc(String genderDesc);
    List<Gender> getAll();
}
