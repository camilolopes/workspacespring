package br.com.camilolopes.rentcar.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.camilolopes.rentcar.domain.bean.Car;
@Repository
public class RentCarDAOImpl implements RentCarDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getCurrentSession(){
		
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Car car) {
		getCurrentSession().save(car);
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Car> findAll() {
		return getCurrentSession().createCriteria(Car.class).list();
	}

	@Override
	public List<Car> findAllByDescription(String description) {
		Criteria createCriteria = getCurrentSession().createCriteria(Car.class);
		createCriteria.add(Restrictions.ilike("description", description));
		return (List<Car>) createCriteria.list();
	}

	@Override
	public void update(Car car) {
		getCurrentSession().update(car);
		
	}

	@Override
	public void delete() {
		Query query = getCurrentSession().createQuery("delete from Car where id >0");
		query.executeUpdate();
	}

}
