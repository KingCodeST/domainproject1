//package za.ac.cputassignment.Repository.person.impl;
//
//import org.springframework.stereotype.Repository;
//import za.ac.cputassignment.Repository.person.RaceRepository;
//import za.ac.cputassignment.domain.person.Race;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class RaceRepositoryImpl implements RaceRepository {
//
//    private static RaceRepositoryImpl repository = null;
//    private Set<Race> raceSet;
//
//    private RaceRepositoryImpl() {
//        this.raceSet = new HashSet<>();
//    }
//
//    private Race findRaceId(String raceId) {
//        return this.raceSet.stream()
//                .filter(driverBus -> driverBus.getId().trim().equals(raceId))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static RaceRepositoryImpl getRepository() {
//        if (repository == null) repository = new RaceRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<Race> getAll() {
//        return this.raceSet;
//    }
//
//    @Override
//    public Race create(Race raceOb) {
//        this.raceSet.add(raceOb);
//        return raceOb;
//    }
//
//    @Override
//    public Race read(String residenceLocationID) {
//        Race raceOb = findRaceId(residenceLocationID);
//        return raceOb;
//    }
//
//    @Override
//    public Race update(Race raceOb) {
//        Race toDelete = findRaceId(raceOb.getId());
//        if (toDelete != null) {
//            this.raceSet.remove(toDelete);
//            return create(raceOb);
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String raceId) {
//        Race raceOb = findRaceId(raceId);
//        if (raceOb != null) this.raceSet.remove(raceOb);
//
//    }
//}