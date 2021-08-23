package it.discovery.service;

import java.util.List;

import it.discovery.model.Book;
import it.discovery.repository.DBBookRepository;

public class MainBookService {
	private final DBBookRepository repository = 
			new DBBookRepository();
	
	public MainBookService() {
		System.out.println("Using db repository");
	}
	
	public void saveBook(Book book) {
		repository.saveBook(book);
	}
	
	public Book findBookById(int id) {
		return repository.findBookById(id);
	}

	public List<Book> findBooks() {
		return repository.findBooks();
	}
}
