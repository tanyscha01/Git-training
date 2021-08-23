package it.discovery.loader;

import java.util.List;

import it.discovery.model.Book;
import it.discovery.service.MainBookService;

public class BootstrapLoader {

	public static void main(String[] args) {
		MainBookService service = new MainBookService();
		Book book = new Book();
		book.setName("Introduction into Spring");
		book.setPages(100);
		book.setYear(2016);
		service.saveBook(book);

		List<Book> books = service.findBooks();
		System.out.println(books);
	}

}
