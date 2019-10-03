//package za.ac.cputassignment.Repository.person.impl;
//
//import org.springframework.stereotype.Repository;
//import za.ac.cputassignment.Repository.person.DriverRepository;
//import za.ac.cputassignment.domain.person.Driver;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class DriverRepositoryImpl implements DriverRepository {
//
//    private static DriverRepositoryImpl repository = null;
//    private Set<Driver> driverSet;
//
//    private DriverRepositoryImpl() {
//        this.driverSet = new HashSet<>();
//    }
//
//    private Driver findArletInfor(String driverId) {
//        return this.driverSet.stream()
//                .filter(driverBus -> driverBus.getDriverID().trim().equals(driverId))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static DriverRepositoryImpl getRepository() {
//        if (repository == null) repository = new DriverRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<Driver> getAll() {
//        return this.driverSet;
//    }
//
//    @Override
//    public Driver create(Driver driverOb) {
//        this.driverSet.add(driverOb);
//        return driverOb;
//    }
//
//    @Override
//    public Driver read(String residenceLocationID) {
//        Driver driverOb = findArletInfor(residenceLocationID);
//        return driverOb;
//    }
//
//    @Override
//    public Driver update(Driver driverOb) {
//        Driver toDelete = findArletInfor(driverOb.getDriverID());
//        if (toDelete != null) {
//            this.driverSet.remove(toDelete);
//            return create(driverOb);
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String driverId) {
//        Driver driverOb = findArletInfor(driverId);
//        if (driverOb != null) this.driverSet.remove(driverOb);
//
//    }
//}
