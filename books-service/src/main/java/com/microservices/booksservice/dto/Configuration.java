package com.microservices.booksservice.dto;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONTokener;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;

import net.minidev.json.parser.JSONParser;

@Component
@ConfigurationProperties("books-service")
public class Configuration {

	String bestselling;
	
	public String getBestselling() {
		return bestselling;
	}

	public void setBestselling(String bestselling) {
		this.bestselling = bestselling;
	}

	public Configuration(String bestselling) {
		super();
		this.bestselling = bestselling;
	}
	public Configuration() {
		super();
	}
}
