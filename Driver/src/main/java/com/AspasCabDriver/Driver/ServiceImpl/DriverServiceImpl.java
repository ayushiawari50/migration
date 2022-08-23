package com.AspasCabDriver.Driver.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AspasCabDriver.Driver.Model.CabDriver;
import com.AspasCabDriver.Driver.Repository.DriverRepository;
import com.AspasCabDriver.Driver.Service.DriverService;


@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	DriverRepository driverRepository;
	
	
	
	@Override
	public List<CabDriver> findAllByActivationStatus() {
		
		return driverRepository.findAllByActivationStatus();
	}



	
	@Override
	public CabDriver updateDriverRegistration(CabDriver driver) {

		return driverRepository.save(driver);
	}


	@Override
	public List<CabDriver> fetchAllDrivers() {

		return driverRepository.findAll();
	}


	@Override
	public Long countDriver() {
		
		return driverRepository.count();
	}




	
	@Override
	public CabDriver updateDriver(CabDriver fetchDriver) {
	
		return driverRepository.save(fetchDriver);
	}


	@Override
	public CabDriver getById(long driverId) {

		return driverRepository.getById(driverId);
	}

	
	@Override
	public CabDriver fetchDriverByEmail(String driverEmail) {
	
		return driverRepository.fetchDriverByEmail(driverEmail);
	}

}
