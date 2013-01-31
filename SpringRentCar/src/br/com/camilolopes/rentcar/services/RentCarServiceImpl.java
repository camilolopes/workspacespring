package br.com.camilolopes.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.camilolopes.rentcar.dao.RentCarDAO;
import br.com.camilolopes.rentcar.domain.bean.Car;
@Service
public class RentCarServiceImpl implements RentCar {
	@Autowired
	private RentCarDAO rentCarDAO;
	@Override
	public void addNewCar(Car car) {
		rentCarDAO.save(car);
	}
	public void setRentCarDAO(RentCarDAO rentCarDAO) {
		this.rentCarDAO = rentCarDAO;
	}
	@Override
	public List<Car> findAll() {
		
		return rentCarDAO.findAll();
	}
	@Override
	public List<Car>findCarByDescription(String description) {
		
		return (List<Car>) rentCarDAO.findAllByDescription(description);
	}
	@Override
	public void updateCar(Car car) {
		rentCarDAO.update(car);
	}
	@Override
	public void delete() {
	rentCarDAO.delete();
		
	}

}
