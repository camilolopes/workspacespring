package br.com.camilolopes.domain.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Category implements Serializable {

	private static final long serialVersionUID = 6469382724082923338L;
	@Id
	@GeneratedValue
	private Long id; 
	private String categoryName;
	@OneToMany(mappedBy="category",targetEntity=Book.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@Autowired
	private List<Book> books = new ArrayList<Book>();
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public List<Book> getBooks() {
		return books;
	}
	
	
}
