package com.microservices.booksservice.controller;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.booksservice.dto.BestsSellingBooks;
import com.microservices.booksservice.dto.Configuration;

@ComponentScan(basePackages = "com.microservices.booksservice")
@RestController
public class BooksController {
	
	Logger logger = LoggerFactory.getLogger(BooksController.class);

	@Autowired
	Configuration configuration;

	@GetMapping("/bestsellers")
	public List<BestsSellingBooks> getBestSellingBooksAndAuthors() {
		List<BestsSellingBooks> books = new java.util.ArrayList<>();
		try {

			JSONArray jsonarray = new JSONArray(configuration.getBestselling());
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject jsonobject = jsonarray.getJSONObject(i);

				String book = jsonobject.getString("book");
				String author = jsonobject.getString("author");
				BestsSellingBooks bsBooks = new BestsSellingBooks(book, author);
				books.add(bsBooks);
			}
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}
		return books;

	}
	
	@GetMapping("/bestsellers/authors")
	public List<String> getBestSellingAuthors() {
		List<String> authors = new java.util.ArrayList<>();
		try {
			JSONArray jsonarray = new JSONArray(configuration.getBestselling());
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject jsonobject = jsonarray.getJSONObject(i);
				authors.add(jsonobject.getString("author"));
			}
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}
		return authors;

	}
	
	
	@GetMapping("/bestsellers/books")
	public List<String> getBestSellingBooks() {
		List<String> books = new java.util.ArrayList<>();
		try {

			JSONArray jsonarray = new JSONArray(configuration.getBestselling());
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject jsonobject = jsonarray.getJSONObject(i);
				books.add(jsonobject.getString("book"));
			}
		} catch (JSONException e) {
			logger.info(e.getMessage());
		}
		return books;

	}

}
