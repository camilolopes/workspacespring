package br.com.camilolopes.car.services;

import java.util.List;

import br.com.camilolopes.car.domain.bean.Car;

public interface CarServices {
	void saveOrUpdate(Car car); 
	void delete(Car car); 
	List<Car> listAll(); 
}
