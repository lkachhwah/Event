package com.example.event.pojo;

import java.util.List;

public class FeaturesEvents {

	String categoryName;
	List<FeaturedEvents> featuredEvents;
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<FeaturedEvents> getFeaturedEvents() {
		return featuredEvents;
	}

	public void setFeaturedEvents(List<FeaturedEvents> featuredEvents) {
		this.featuredEvents = featuredEvents;
	}


}
