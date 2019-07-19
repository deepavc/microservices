package com.microservices.bookdetailsservice;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BestSellers")
public class BestSellers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String book_name;
	private String author_name;
	private String isbn;
	private String stars;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	
	public BestSellers() {
		
	}
	
	public BestSellers(String book_name, String author_name, String isbn, String stars) {
		super();
		this.book_name = book_name;
		this.author_name = author_name;
		this.isbn = isbn;
		this.stars = stars;
	}
	
	
}
