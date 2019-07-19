package com.microservices.bookdetailsservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestsellersRepo extends CrudRepository<BestSellers, Integer> {

}
