package com.example.event.pojo;

import java.util.ArrayList;

public class Tabular {

	private String sort_direction;
	private String fast_forward_date;
	private String location_type;
	private String pagenumber;
	private String user = null;
	ArrayList<Object> neighborhood;
	Facets facets;

	private String when;
	private String mature;
	private float facet_depth;
	private String sort_order;
	private float radius;
	private String query;
	private String stsess;
	private String location_id;
	private String page_number;
	private float search_time;
	private String page_size;
	private float page_count;
	ArrayList<Featured_events> events;
	ArrayList<Object> venue;
	private String total_hits;
	private float return_facets;
	private String pagesize;
	private String search_query;
	private String units;

	// Getter Methods

	public String getSort_direction() {
		return sort_direction;
	}

	public String getFast_forward_date() {
		return fast_forward_date;
	}

	public String getLocation_type() {
		return location_type;
	}

	public String getPagenumber() {
		return pagenumber;
	}

	public String getUser() {
		return user;
	}

	public String getWhen() {
		return when;
	}

	public String getMature() {
		return mature;
	}

	public float getFacet_depth() {
		return facet_depth;
	}

	public String getSort_order() {
		return sort_order;
	}

	public float getRadius() {
		return radius;
	}

	public String getQuery() {
		return query;
	}

	public String getStsess() {
		return stsess;
	}

	public String getLocation_id() {
		return location_id;
	}

	public String getPage_number() {
		return page_number;
	}

	public float getSearch_time() {
		return search_time;
	}

	public String getPage_size() {
		return page_size;
	}

	public float getPage_count() {
		return page_count;
	}

	public String getTotal_hits() {
		return total_hits;
	}

	public float getReturn_facets() {
		return return_facets;
	}

	public String getPagesize() {
		return pagesize;
	}

	public String getSearch_query() {
		return search_query;
	}

	public String getUnits() {
		return units;
	}

	// Setter Methods

	public void setSort_direction(String sort_direction) {
		this.sort_direction = sort_direction;
	}

	public void setFast_forward_date(String fast_forward_date) {
		this.fast_forward_date = fast_forward_date;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public void setPagenumber(String pagenumber) {
		this.pagenumber = pagenumber;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public void setMature(String mature) {
		this.mature = mature;
	}

	public void setFacet_depth(float facet_depth) {
		this.facet_depth = facet_depth;
	}

	public void setSort_order(String sort_order) {
		this.sort_order = sort_order;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setStsess(String stsess) {
		this.stsess = stsess;
	}

	public void setPage_number(String page_number) {
		this.page_number = page_number;
	}

	public void setSearch_time(float search_time) {
		this.search_time = search_time;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}

	public void setPage_count(float page_count) {
		this.page_count = page_count;
	}

	public void setTotal_hits(String total_hits) {
		this.total_hits = total_hits;
	}

	public void setReturn_facets(float return_facets) {
		this.return_facets = return_facets;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

	public void setSearch_query(String search_query) {
		this.search_query = search_query;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Tabular [sort_direction=" + sort_direction + ", fast_forward_date=" + fast_forward_date
				+ ", location_type=" + location_type + ", pagenumber=" + pagenumber + ", user=" + user
				+ ", neighborhood=" + neighborhood + ", facets=" + facets + ", when=" + when + ", mature=" + mature
				+ ", facet_depth=" + facet_depth + ", sort_order=" + sort_order + ", radius=" + radius + ", query="
				+ query + ", stsess=" + stsess + ", location_id=" + location_id + ", page_number=" + page_number
				+ ", search_time=" + search_time + ", page_size=" + page_size + ", page_count=" + page_count
				+ ", events=" + events + ", venue=" + venue + ", total_hits=" + total_hits + ", return_facets="
				+ return_facets + ", pagesize=" + pagesize + ", search_query=" + search_query + ", units=" + units
				+ "]";
	}

	public ArrayList<Object> getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(ArrayList<Object> neighborhood) {
		this.neighborhood = neighborhood;
	}

	public Facets getFacets() {
		return facets;
	}

	public void setFacets(Facets facets) {
		this.facets = facets;
	}

	/*
	 * public void setLocations(Locations locations) { this.locations =
	 * locations; }
	 */

	public ArrayList<Featured_events> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Featured_events> events) {
		this.events = events;
	}

	public ArrayList<Object> getVenue() {
		return venue;
	}

	public void setVenue(ArrayList<Object> venue) {
		this.venue = venue;
	}

}
