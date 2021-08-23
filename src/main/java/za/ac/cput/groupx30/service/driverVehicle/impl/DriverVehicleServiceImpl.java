package za.ac.cput.groupx30.service.driverVehicle.impl;

// Author: Thokozile Snono
// Student number: 216032121
// Service: DriverVehicleServiceImpl Class
// Date: 02 August 2021

import org.springframework.stereotype.Service;
import za.ac.cput.groupx30.entity.DriverVehicle;
import za.ac.cput.groupx30.repository.driverVehicle.DriverVehicleRepository;
import za.ac.cput.groupx30.repository.driverVehicle.impl.DriverVehicleRepositoryImpl;
import za.ac.cput.groupx30.service.driverVehicle.DriverVehicleService;

import java.util.HashSet;
import java.util.Set;

@Service
public class DriverVehicleServiceImpl implements DriverVehicleService {

    private static DriverVehicleService service = null;
        private DriverVehicleRepository repository;

        private DriverVehicleServiceImpl() {
            this.repository = DriverVehicleRepositoryImpl.getRepository();
        }

        public static DriverVehicleService getService() {
            if (service == null) service = new DriverVehicleServiceImpl();
            return service;
        }

    @Override
    public Set< DriverVehicle > getAll() {
        return getAllStartWithM();
    }

    @Override
    public Set< DriverVehicle > getAllStartWithM() {
        Set<DriverVehicle> driverVehicles = getAll();
                Set<DriverVehicle> driverVehiclesWithM = new HashSet<>();
                for (DriverVehicle driverVehicle : driverVehicles){
                    if (driverVehicle.getVehicleId().trim().toLowerCase().startsWith("m")){
                        driverVehiclesWithM.add(driverVehicle);
                    }
                }
                return driverVehiclesWithM;
    }

    @Override
    public DriverVehicle create(DriverVehicle driverVehicle) {
        return this.repository.create(driverVehicle);
    }

    @Override
    public DriverVehicle read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DriverVehicle update(DriverVehicle driverVehicle) {
        return this.repository.update(driverVehicle);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
