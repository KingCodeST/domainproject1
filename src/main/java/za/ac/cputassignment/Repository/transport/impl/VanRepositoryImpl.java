//package za.ac.cputassignment.Repository.transport.impl;
//
//import org.springframework.stereotype.Repository;
//import za.ac.cputassignment.domain.transport.Van;
//import za.ac.cputassignment.service.transport.VanService;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class VanRepositoryImpl  implements VanService {
//
//    private static VanRepositoryImpl repository = null;
//    private Set<Van> vanSet;
//
//    private VanRepositoryImpl() {
//        this.vanSet = new HashSet<>();
//    }
//
//    private Van FindStudentId(String busId) {
//        return this.vanSet.stream()
//                .filter(driverBus -> driverBus.getVanId().trim().equals(busId))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static VanRepositoryImpl getRepository() {
//        if (repository == null) repository = new VanRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<Van> getAll() {
//        return this.vanSet;
//    }
//
//    @Override
//    public Van create(Van vanObj) {
//        this.vanSet.add(vanObj);
//        return vanObj;
//    }
//
//    @Override
//    public Van read(String residenceLocationID) {
//        Van vanObj = FindStudentId(residenceLocationID);
//        return vanObj;
//    }
//
//    @Override
//    public Van update(Van vanObj) {
//        Van toDelete = FindStudentId(vanObj.getVanId());
//        if (toDelete != null) {
//            this.vanSet.remove(toDelete);
//            return create(vanObj);
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String busId) {
//        Van vanObj = FindStudentId(busId);
//        if (vanObj != null) this.vanSet.remove(vanObj);
//
//    }
//}