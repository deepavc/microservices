package com.microservices.bookdetailsservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class BestsellersDTO {
	
	
	String book;
	String author;
	
	
	

	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor_name() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public BestSellers adaptTo(BestsellersDTO bs) {
		return new BestSellers(bs.book, bs.author,"" , "");
	}
	
	
}

