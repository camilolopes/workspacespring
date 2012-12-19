package br.com.camilolopes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.camilolopes.car.domain.bean.Car;
import br.com.camilolopes.car.services.CarServices;

@Controller
public class CarController {
	@Autowired
	private CarServices carServices;
	private Car car;
	
	private List<Car> listCars;
	
	public CarController() {
		car = new Car();
	}
	
	public void save(){
		carServices.saveOrUpdate(car);
		car = new Car();
	}

	public void delete(){
		carServices.delete(car);
		car = new Car();
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Car> getListCars() {
		listCars = carServices.listAll();
		return listCars;
	}
	public void setListCars(List<Car> listCars) {
		this.listCars = listCars;
	}
	public void setCarServices(CarServices carServices) {
		this.carServices = carServices;
	}
}
