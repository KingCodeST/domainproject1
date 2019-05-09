package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cputassignment.Repository.LocationRepository.SportFieldRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Optional;
import java.util.Set;

public class SportFieldRepositoryImpl implements SportFieldRepository {



    @Override
    public <S extends SportField> S save(S s) {
        return this.save(s);
    }

    @Override
    public <S extends SportField> Iterable<S> saveAll(Iterable<S> iterable) {
        return this.saveAll(iterable);
    }

    @Override
    public Optional<SportField> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<SportField> findAll() {
        return this.findAll();
    }

    @Override
    public Iterable<SportField> findAllById(Iterable<String> iterable) {
        return findAllById(iterable);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(SportField sportField) {

    }

    @Override
    public void deleteAll(Iterable<? extends SportField> iterable) {
    }

    @Override
    public void deleteAll() {

    }
}
