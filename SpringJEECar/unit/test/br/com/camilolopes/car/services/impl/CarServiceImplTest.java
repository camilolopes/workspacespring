package br.com.camilolopes.car.services.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.camilolopes.car.domain.bean.Car;
import br.com.camilolopes.car.services.CarServices;
/*
 * deveria criar um .xml especifico para os testes e não usar o da aplicação
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springconfiguration-test.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)
@Transactional
public class CarServiceImplTest {
	@Autowired
	private CarServices carServices;
	private Car car;
	@Before
	public void setUp() throws Exception {
	car = new Car();
	car.setDescription("ferrari");
	car.setPriceSale(BigDecimal.ZERO);
	car.setYear("2010");
	}
	
//	@Rollback(false) //isso faz inserir no banco
	@Test
	public void testSaveOrUpdate() {
		try{
			carServices.saveOrUpdate(car);
		}catch (Exception e) {
			fail("not expected result");
		}
	}

	@Test
	public void testDelete() {
		try{carServices.saveOrUpdate(car);
			carServices.delete(car);
		}catch (Exception e) {
			String notExpectedResult = "Not expected result "+ e.getMessage();
			fail(notExpectedResult);
		}
	}
	@Test
	public void testListAll() {
		carServices.saveOrUpdate(car);
		assertFalse(carServices.listAll().isEmpty());
	}
}
