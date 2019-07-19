package com.microservices.bookdetailsservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BestsellersController {
	
	@Autowired
	private BestsellerService service;
	
	@Autowired
	private BooksServiceProxy proxy;
	
	@GetMapping("/addBestsellersFromConfigs")
	public void addAllConfigsToDB() {
		List<BestsellersDTO> books  = proxy.getBestSellingBooksAndAuthors();
		service.addToDB(books);
	
	}

}
