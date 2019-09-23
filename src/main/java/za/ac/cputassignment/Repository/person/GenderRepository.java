package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Gender;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender,String> {
    Set<Gender>getAll();
}
