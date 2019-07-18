package com.microservices.booksservice.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Books {

	BestsSellingBooks bestselling;

	public BestsSellingBooks getBestselling() {
		return bestselling;
	}

	public void setBestselling(BestsSellingBooks bestselling) {
		this.bestselling = bestselling;
	}

	public Books(BestsSellingBooks bestselling) {
		super();
		this.bestselling = bestselling;
	}
	public Books() {
		super();
	}
}
