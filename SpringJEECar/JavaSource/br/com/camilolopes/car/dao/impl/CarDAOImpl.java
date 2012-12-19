package br.com.camilolopes.car.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.camilolopes.car.dao.CarDAO;
import br.com.camilolopes.car.domain.bean.Car;

@Repository
public class CarDAOImpl implements CarDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	public void addCar(Car car) {
		getCurrentSession().saveOrUpdate(car);
	}

	public List<Car> readAll() {
		return getCurrentSession().createCriteria(Car.class).list();
	}

	public void deleteCar(Long id) {
		Criteria criteria = getCurrentSession().createCriteria(Car.class);
		criteria.add(Restrictions.eq("id", id));
		Car car = (Car) criteria.uniqueResult();
		getCurrentSession().delete(car);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
