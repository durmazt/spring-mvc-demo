package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstname;
	private String lastname;
	private String country;
	private String favlang;
	private String []OS;
	public String[] getOS() {
		return OS;
	}

	public void setOS(String[] oS) {
		OS = oS;
	}

	private LinkedHashMap<String,String> countryopt;


	public Student() {
		
		countryopt =new LinkedHashMap<String, String>();
		countryopt.put("BR", "Brazil");
		countryopt.put("FR", "France");
		countryopt.put("DE", "GERMANY");
		countryopt.put("TR", "Turkey");
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryopt() {
		return countryopt;
	}

	public String getFavlang() {
		return favlang;
	}

	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}
	
}
