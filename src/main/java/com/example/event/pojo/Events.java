package com.example.event.pojo;

public class Events {
	 private float in_metro;
	 private float give_results;
	 Search search;
	 Location location;
	 private String localized_base_url;
	 private String is_default_eventful_site;
	 private String category_name = null;
	 private String this_url;
	 private String facebook_app_namespace;
	 private String home_url;
	 Featured_events Featured_events;
	 private String end_of_results;
	 private float in_rec;


	 // Getter Methods 

	 public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public float getIn_metro() {
	  return in_metro;
	 }

	 public float getGive_results() {
	  return give_results;
	 }

	 public String getLocalized_base_url() {
	  return localized_base_url;
	 }

	 public String getIs_default_eventful_site() {
	  return is_default_eventful_site;
	 }

	 public String getCategory_name() {
	  return category_name;
	 }

	 public String getThis_url() {
	  return this_url;
	 }

	 public String getFacebook_app_namespace() {
	  return facebook_app_namespace;
	 }

	 public String getHome_url() {
	  return home_url;
	 }

	 public Featured_events getFeatured_events() {
	  return Featured_events;
	 }

	 public String getEnd_of_results() {
	  return end_of_results;
	 }

	 public float getIn_rec() {
	  return in_rec;
	 }

	 // Setter Methods 

	 public void setIn_metro(float in_metro) {
	  this.in_metro = in_metro;
	 }

	 public void setGive_results(float give_results) {
	  this.give_results = give_results;
	 }

	 public void setLocalized_base_url(String localized_base_url) {
	  this.localized_base_url = localized_base_url;
	 }

	 public void setIs_default_eventful_site(String is_default_eventful_site) {
	  this.is_default_eventful_site = is_default_eventful_site;
	 }

	 public void setCategory_name(String category_name) {
	  this.category_name = category_name;
	 }

	 public void setThis_url(String this_url) {
	  this.this_url = this_url;
	 }

	 public void setFacebook_app_namespace(String facebook_app_namespace) {
	  this.facebook_app_namespace = facebook_app_namespace;
	 }

	 public void setHome_url(String home_url) {
	  this.home_url = home_url;
	 }

	 public void setFeatured_events(Featured_events featured_eventsObject) {
	  this.Featured_events = featured_eventsObject;
	 }

	 public void setEnd_of_results(String end_of_results) {
	  this.end_of_results = end_of_results;
	 }

	 public void setIn_rec(float in_rec) {
	  this.in_rec = in_rec;
	 }

	@Override
	public String toString() {
		return "MyPojo [in_metro=" + in_metro + ", give_results=" + give_results + ", search=" + search + ", location="
				+ location + ", localized_base_url=" + localized_base_url + ", is_default_eventful_site="
				+ is_default_eventful_site + ", category_name=" + category_name + ", this_url=" + this_url
				+ ", facebook_app_namespace=" + facebook_app_namespace + ", home_url=" + home_url + ", Featured_events="
				+ Featured_events + ", end_of_results=" + end_of_results + ", in_rec=" + in_rec + "]";
	}

	}
	