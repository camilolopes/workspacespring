package br.com.camilolopes.rentcar.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.camilolopes.rentcar.domain.bean.Car;
@Service
public interface RentCar {
	void addNewCar(Car car);
	List<Car> findAll();
	List<Car> findCarByDescription(String description);
	void updateCar(Car car);
	void delete();
}
