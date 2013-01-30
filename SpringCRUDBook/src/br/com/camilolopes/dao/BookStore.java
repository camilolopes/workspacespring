package br.com.camilolopes.dao;

import br.com.camilolopes.domain.classes.Book;

public interface BookStore {
	void saveOrUpdate(Book book); 
	void delete(Book book);
	Book findById(Long id); 
}
