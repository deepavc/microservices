package com.microservices.bookdetailsservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class BestsellerService {
	
	@Autowired
	private BestsellersRepo repo;
	
	public void addToDB(List<BestsellersDTO> bestsellers){
		
		for(BestsellersDTO b : bestsellers) {
			BestSellers bs = b.adaptTo(b);
			repo.save(bs);
		}
	
		/*BestSellers bs = new BestSellers("a", "b", "c", "d");
		repo.save(bs);*/
		
	}

}
