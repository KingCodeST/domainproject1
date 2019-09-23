package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.transport.VanVehicleService;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class VanVehicleRepositoryImpl implements VanVehicleService {

    private static VanVehicleRepositoryImpl repository = null;
    private Set<VanVehicle> vanVehicleSet;

    private VanVehicleRepositoryImpl() {
        this.vanVehicleSet = new HashSet<>();
    }

    private VanVehicle findVanVehicle(String busId) {
        return this.vanVehicleSet.stream()
                .filter(driverBus -> driverBus.getVehicleVan().trim().equals(busId))
                .findAny()
                .orElse(null);
    }

    public static VanVehicleRepositoryImpl getRepository() {
        if (repository == null) repository = new VanVehicleRepositoryImpl();
        return repository;
    }

    @Override
    public Set<VanVehicle> getAll() {
        return this.vanVehicleSet;
    }

    @Override
    public VanVehicle create(VanVehicle vanVehicleObj) {
        this.vanVehicleSet.add(vanVehicleObj);
        return vanVehicleObj;
    }

    @Override
    public VanVehicle read(String residenceLocationID) {
        VanVehicle vanVehicleObj = findVanVehicle(residenceLocationID);
        return vanVehicleObj;
    }

    @Override
    public VanVehicle update(VanVehicle vanVehicleObj) {
        VanVehicle toDelete = findVanVehicle(vanVehicleObj.getVehicleVan());
        if (toDelete != null) {
            this.vanVehicleSet.remove(toDelete);
            return create(vanVehicleObj);
        }
        return null;
    }

    @Override
    public void delete(String busId) {
        VanVehicle vanVehicleObj = findVanVehicle(busId);
        if (vanVehicleObj != null) this.vanVehicleSet.remove(vanVehicleObj);

    }
}
