package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.GenderRepository;
import za.ac.cputassignment.domain.person.Gender;

import java.util.HashSet;
import java.util.Set;


public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Set<Gender> genderSet;

    private GenderRepositoryImpl() {
        this.genderSet = new HashSet<>();
    }

    private Gender findArletInfor(String genderId) {
        return this.genderSet.stream()
                .filter(driverBus -> driverBus.getGenderId().trim().equals(genderId))
                .findAny()
                .orElse(null);
    }

    public static GenderRepositoryImpl getRepository() {
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return this.genderSet;
    }

    @Override
    public Gender create(Gender genderOb) {
        this.genderSet.add(genderOb);
        return genderOb;
    }

    @Override
    public Gender read(String residenceLocationID) {
        Gender genderOb = findArletInfor(residenceLocationID);
        return genderOb;
    }

    @Override
    public Gender update(Gender genderOb) {
        Gender toDelete = findArletInfor(genderOb.getGenderId());
        if (toDelete != null) {
            this.genderSet.remove(toDelete);
            return create(genderOb);
        }
        return null;
    }

    @Override
    public void delete(String genderId) {
        Gender genderOb = findArletInfor(genderId);
        if (genderOb != null) this.genderSet.remove(genderOb);

    }
}

