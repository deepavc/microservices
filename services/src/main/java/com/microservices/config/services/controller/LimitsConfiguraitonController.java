package com.microservices.config.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.config.services.Configuration.Configuration;

@ComponentScan(basePackages="com.microservices.config.services")
@RestController
public class LimitsConfiguraitonController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping(name="/limits")
	public LimitsConfiguration getLimitsConfiguraiton() {
		return new LimitsConfiguration(configuration.getMinimumLimit(), configuration.getMaximumLimit());
	}
}
