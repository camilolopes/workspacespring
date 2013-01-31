package br.com.camilolopes.rentcar.dao;

import java.util.List;

import br.com.camilolopes.rentcar.domain.bean.Car;


public interface RentCarDAO {
	void save(Car car);

	List<Car> findAll();

	List<Car> findAllByDescription(String description);

	void update(Car car);

	void delete();
}
