//package za.ac.cputassignment.Repository.location.impl;
//
//
//import za.ac.cputassignment.Repository.location.LocationRepository;
//import za.ac.cputassignment.domain.location.Location;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class LocationRepositoryImpl implements LocationRepository {
//
//    private static LocationRepositoryImpl repository =null;
//    private Set<Location> Locations;
//
//    private LocationRepositoryImpl(){
//        this.Locations =new HashSet<>();
//    }
//
//    private Location findArletInfor(String LocationsId)
//    {
//        return this.Locations.stream()
//                .filter(Locationss -> Locationss.getLocationId().trim().equals(LocationsId))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static LocationRepositoryImpl getRepository(){
//        if(repository ==null) repository=new LocationRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<Location> getAll() {
//        return this.Locations;
//    }
//
//    @Override
//    public Location create(Location Locationss) {
//        this.Locations.add(Locationss);
//        return Locationss;
//    }
//
//    @Override
//    public Location read(String locationId) {
//        Location Locationss=findArletInfor(locationId);
//        return Locationss;
//    }
//
//    @Override
//    public Location update(Location Locationss) {
//        Location toDelete =findArletInfor(Locationss.getLocationId());
//        if(toDelete !=null)
//        {
//            this.Locations.remove(toDelete);
//            return create(Locationss);
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String locationId) {
//        Location Locationss=findArletInfor(locationId);
//        if (Locationss !=null) this.Locations.remove(Locationss);
//
//    }
//}