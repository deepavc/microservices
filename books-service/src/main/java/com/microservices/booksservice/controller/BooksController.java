package com.microservices.booksservice.controller;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.andrewoma.dexx.collection.ArrayList;
import com.microservices.booksservice.dto.BestsSellingBooks;
import com.microservices.booksservice.dto.Books;
import com.microservices.booksservice.dto.Configuration;

@ComponentScan(basePackages = "com.microservices.booksservice")
@RestController
public class BooksController {

	@Autowired
	Configuration configuration;

	@GetMapping(name = "/bestsellers")
	public List<BestsSellingBooks> getBestSellingBooks() {
		List<BestsSellingBooks> books = new java.util.ArrayList<>();
		try {
			String bestSelling = configuration.getBestselling();
			

			JSONArray jsonarray = new JSONArray(bestSelling);
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject jsonobject = jsonarray.getJSONObject(i);

				String book = jsonobject.getString("book");
				String author = jsonobject.getString("author");
				BestsSellingBooks bsBooks = new BestsSellingBooks(book, author);
				books.add(bsBooks);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;

	}

}
