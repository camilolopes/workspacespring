package br.com.camilolopes.domain.classes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Book implements Serializable{
	private static final long serialVersionUID = 888299914160143622L;
	
	@Id
	@GeneratedValue
	private Long id; 
	private Long isbn; 
	private String title; 
	private String author;
	@ManyToOne
	@JoinColumn(name="category_id")
	@Autowired
	private Category category;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Category getCategory() {
		return category;
	} 
	
	
}
