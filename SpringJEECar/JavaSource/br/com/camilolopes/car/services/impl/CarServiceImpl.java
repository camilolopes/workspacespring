package br.com.camilolopes.car.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.camilolopes.car.dao.CarDAO;
import br.com.camilolopes.car.domain.bean.Car;
import br.com.camilolopes.car.services.CarServices;
@Service
public class CarServiceImpl implements CarServices {
	@Autowired
	private CarDAO carDAO;
	
	public void saveOrUpdate(Car car) {
		carDAO.addCar(car);
	}

	public void delete(Car car) {
		carDAO.deleteCar(car.getId());
	}

	public List<Car> listAll() {
	
		return carDAO.readAll();
	}

	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

}
