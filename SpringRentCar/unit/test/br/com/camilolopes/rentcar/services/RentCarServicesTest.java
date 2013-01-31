package br.com.camilolopes.rentcar.services;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.camilolopes.rentcar.domain.bean.Car;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/springconfiguration.xml"})
public class RentCarServicesTest {
	@Autowired
	private RentCar rentCarServicesImpl;
	private Car car;
	@Before
	public void setUp() throws Exception {
		car = new Car();
	}
	@Test
	public void testAddingNewCarWithSuccess(){
		try{
			car.setDescription("Civic"); 
			car.setManufacter("Honda");
			car.setMarketValue(new BigDecimal(740000));
			rentCarServicesImpl.addNewCar(car );
		}catch (Exception e) {
			Assert.fail("not expected result");
		}
	}
	@Test
	public void testListAllCarIsNotEmpty(){
		assertFalse(rentCarServicesImpl.findAll().isEmpty());
	}
	
	@Test
	public void testUpdateDescriptionCarIsEqualCivicNew(){
		List<Car> listCars = rentCarServicesImpl.findCarByDescription("Civic");
		for (Car car : listCars) {
			car.setDescription("CivicNew");
			rentCarServicesImpl.updateCar(car);
		}
		assertEquals("CivicNew",rentCarServicesImpl.findCarByDescription("CivicNew").get(0).getDescription());
		assertTrue(rentCarServicesImpl.findCarByDescription("Civic").isEmpty());
	}
	
	@Test
	public void testDeleteAll(){
		rentCarServicesImpl.delete();
		assertTrue(rentCarServicesImpl.findAll().isEmpty());
	}
	
}
