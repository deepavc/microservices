package com.microservices.booksservice.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public class BestsSellingBooks {

	String book;
	String author;

	public BestsSellingBooks() {
		super();
	}

	public BestsSellingBooks(String book, String author) {
		super();
		this.book = book;
		this.author = author;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
