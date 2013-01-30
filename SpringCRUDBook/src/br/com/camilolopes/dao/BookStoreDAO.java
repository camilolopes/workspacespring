package br.com.camilolopes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.camilolopes.domain.classes.Book;

@Repository
public class BookStoreDAO implements BookStore {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public Book findById(Long id) {
		return hibernateTemplate.get(Book.class, id);
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Override
	public void saveOrUpdate(Book book) {
		hibernateTemplate.saveOrUpdate(book);
	}

	@Override
	public void delete(Book book) {
		hibernateTemplate.delete(book);
	}
	
}
