package com.nibuton.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] opers;
	
	private Map<String, String> countryOptions;
	private Map<String, String> languageOptions;
	private Map<String, String> operOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		languageOptions = new LinkedHashMap<String, String>();
		operOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("RUS", "Russia");
		countryOptions.put("UKR", "Ukraine");
		countryOptions.put("GER", "Germany");
		countryOptions.put("MAC", "Macedonia");
		countryOptions.put("POR", "Portugal");
		
		languageOptions.put("Java", "Java");
		languageOptions.put("Python", "Python");
		languageOptions.put("Ruby", "Ruby");
		
		operOptions.put("Win", "Windows");
		operOptions.put("Lin", "Linux");
		operOptions.put("Mac", "Mac OS");
		
		}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Map<String, String> getLanguageOptions() {
		return languageOptions;
	}
	public Map<String, String> getOperOptions() {
		return operOptions;
	}
	public String[] getOpers() {
		return opers;
	}
	public void setOpers(String[] opers) {
		this.opers = opers;
	}
	
}
