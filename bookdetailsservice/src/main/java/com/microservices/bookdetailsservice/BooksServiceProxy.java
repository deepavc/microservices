package com.microservices.bookdetailsservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices.bookdetailsservice.BestsSellingBooks;


@FeignClient(name="books-service",url="localhost:8000")
public interface BooksServiceProxy {
	
	@GetMapping("/bestsellers")
	public List<BestsellersDTO> getBestSellingBooksAndAuthors();
}
