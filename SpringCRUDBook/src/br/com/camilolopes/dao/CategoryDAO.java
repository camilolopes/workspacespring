package br.com.camilolopes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.camilolopes.domain.classes.Category;

@Repository
public class CategoryDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveOrUpdate(Category category){
		hibernateTemplate.saveOrUpdate(category);
	}
}
