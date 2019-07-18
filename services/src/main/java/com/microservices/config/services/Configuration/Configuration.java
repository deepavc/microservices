package com.microservices.config.services.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("limits-config-service")
public class Configuration {
	
	String minimumLimit;
	String maximumLimit;
	
	public Configuration() {
		super();
	}

	public Configuration(String minimumLimit, String maximumLimit) {
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
