package com.example.event.pojo;

import java.util.ArrayList;

public class Facets {
	private ArrayList<Neighborhoods> neighborhoods;

	public ArrayList<Neighborhoods> getNeighborhoods() {
		return neighborhoods;
	}

	public void setNeighborhoods(ArrayList<Neighborhoods> neighborhoods) {
		this.neighborhoods = neighborhoods;
	}

	@Override
	public String toString() {
		return "Facets [neighborhoods=" + neighborhoods + ", cities=" + cities + ", venues=" + venues + ", categories="
				+ categories + "]";
	}

	 private ArrayList<Cities> cities;
	
	 private ArrayList<Venue> venues;
	
	 private ArrayList<Categories> categories;

	public ArrayList<Cities> getCities() {
		return cities;
	}

	public void setCities(ArrayList<Cities> cities) {
		this.cities = cities;
	}

	public ArrayList<Venue> getVenues() {
		return venues;
	}

	public void setVenues(ArrayList<Venue> venues) {
		this.venues = venues;
	}

	public ArrayList<Categories> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Categories> categories) {
		this.categories = categories;
	}
	

}
