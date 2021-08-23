package it.discovery.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Book in a library
 * @author morenets
 *
 */
@Getter
@Setter
@ToString
public class Book {
	private int id;
	
	private String name;
	
	/**
	 * Publishing year
	 */
	private int year;
	
	/**
	 * Total number of pages
	 */
	private int pages;
	
}
