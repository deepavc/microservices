package com.microservices.config.services.controller;




public class LimitsConfiguration {
	
	String minimumLimit;
	String maximumLimit;
	
	
	
	public LimitsConfiguration(String minimumLimit, String maximumLimit) {
		super();
		this.minimumLimit = minimumLimit;
		this.maximumLimit = maximumLimit;
	}
	
	public String getMinimumLimit() {
		return minimumLimit;
	}
	public void setMinimumLimit(String minimumLimit) {
		this.minimumLimit = minimumLimit;
	}
	public String getMaximumLimit() {
		return maximumLimit;
	}
	public void setMaximumLimit(String maximumLimit) {
		this.maximumLimit = maximumLimit;
	}
	

}
