package za.ac.cput.groupx30.service.impl;

// Author: Thokozile Snono
// Student number: 216032121
// Service: VehicleServiceImpl Class
// Date: 02 August 2021

import org.springframework.stereotype.Service;
import za.ac.cput.groupx30.entity.Vehicle;
import za.ac.cput.groupx30.repository.VehicleRepository;
import za.ac.cput.groupx30.repository.impl.VehicleRepositoryImpl;
import za.ac.cput.groupx30.service.VehicleService;

import java.util.Set;

@Service
public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository repository;
    private static VehicleServiceImpl service;

    private VehicleServiceImpl() {
        this.repository = VehicleRepositoryImpl.getRepository();
    }

    public static VehicleServiceImpl getService() {
        if (service == null)
            service = new VehicleServiceImpl();
        return service;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.repository.create(vehicle);
    }

    @Override
    public Vehicle read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.repository.update(vehicle);
    }

    @Override
    public boolean delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.repository.getAll();
    }
}