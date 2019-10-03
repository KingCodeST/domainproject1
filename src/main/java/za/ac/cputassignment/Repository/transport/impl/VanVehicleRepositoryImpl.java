//package za.ac.cputassignment.Repository.transport.impl;
//
//import org.springframework.stereotype.Repository;
//import za.ac.cputassignment.domain.transport.VanVehicle;
//import za.ac.cputassignment.service.transport.VanVehicleService;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class VanVehicleRepositoryImpl implements VanVehicleService {
//
//    private static VanVehicleRepositoryImpl repository =null;
//    private Set<VanVehicle> specialLocationLset;
//
//    private VanVehicleRepositoryImpl(){
//        this.specialLocationLset =new HashSet<>();
//    }
//
//    private VanVehicle FindSpecialLocationL(String specialLocationLId)
//    {
//        return this.specialLocationLset.stream()
//                .filter(specialLocationL -> specialLocationL.getVehicleVan().trim().equals(specialLocationLId))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static VanVehicleRepositoryImpl getRepository(){
//        if(repository ==null) repository=new VanVehicleRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<VanVehicle> getAll() {
//        return this.specialLocationLset;
//    }
//
//    @Override
//    public VanVehicle create(VanVehicle vanVehicle) {
//        this.specialLocationLset.add(vanVehicle);
//        return vanVehicle;
//    }
//
//    @Override
//    public VanVehicle read(String specialLId) {
//        VanVehicle vanVehicle=FindSpecialLocationL(specialLId);
//        return vanVehicle;
//    }
//
//    @Override
//    public VanVehicle update(VanVehicle vanVehicle) {
//        VanVehicle toDelete =FindSpecialLocationL(vanVehicle.getVehicleVan());
//        if(toDelete !=null)
//        {
//            this.specialLocationLset.remove(toDelete);
//            return create(vanVehicle);
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String ResidenceLocationID) {
//        VanVehicle vanVehicle=FindSpecialLocationL(ResidenceLocationID);
//        if (vanVehicle !=null) this.specialLocationLset.remove(vanVehicle);
//
//    }
//}
//
