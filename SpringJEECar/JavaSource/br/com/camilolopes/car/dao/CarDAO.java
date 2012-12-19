package br.com.camilolopes.car.dao;

import java.util.List;

import br.com.camilolopes.car.domain.bean.Car;

public interface CarDAO {
	void addCar(Car car);
	List<Car> readAll();
	void deleteCar(Long id); 
	
}
