package br.com.camilolopes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.camilolopes.dao.BookStoreDAO;
import br.com.camilolopes.dao.CategoryDAO;
import br.com.camilolopes.domain.classes.Book;
import br.com.camilolopes.domain.classes.Category;

public class Main {
	public static void main(String[] args) {
//		essa classe é o container 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"conf/springconfiguration.xml");
		BookStoreDAO bookStoreDAO = (BookStoreDAO) applicationContext.getBean("bookstoredao");
		CategoryDAO categoryDAO = (CategoryDAO) applicationContext.getBean("categorydao");
		
//		Book 
		Book book = new Book();
		book.setAuthor("Camilo Lopes");
		book.setIsbn(1235L);
		book.setTitle("Guia JEE c/ Frameworks");
		
		//Category 
		Category category = new Category();
		category.getBooks().add(book);
		category.setBooks(category.getBooks());
		category.setCategoryName("Development");
		book.setCategory(category );
//		DAO
		categoryDAO.saveOrUpdate(category);
		bookStoreDAO.saveOrUpdate(book);
		
//		findBookById(bookStoreDAO, 1L);
//		deleteBook(bookStoreDAO,1L);
	}
	
	private static void deleteBook(BookStoreDAO bookStoreDAO, long id) {
		Book bookFound = bookStoreDAO.findById(id);
		bookStoreDAO.delete(bookFound);
		System.out.println("Book deleted with sucess " + bookFound.getTitle());
		
	}
	private static void findBookById(BookStoreDAO bookStoreDAO, Long id){
		Book book = bookStoreDAO.findById(id);
		System.out.println("Title: "+ book.getTitle());
		System.out.println("Author: " + book.getAuthor());
	}
}
