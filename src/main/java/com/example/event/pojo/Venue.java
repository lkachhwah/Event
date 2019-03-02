package com.example.event.pojo;

public class Venue {

	 private String longitude;
	 private String city;
	 private String location = null;
	 private String latitude;
	 private String region;
	 private String name;
	 private String permalink;


	 // Getter Methods 

	 public String getLongitude() {
	  return longitude;
	 }

	 public String getCity() {
	  return city;
	 }

	 public String getLocation() {
	  return location;
	 }

	 public String getLatitude() {
	  return latitude;
	 }

	 public String getRegion() {
	  return region;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getPermalink() {
	  return permalink;
	 }

	 // Setter Methods 

	 public void setLongitude(String longitude) {
	  this.longitude = longitude;
	 }

	 public void setCity(String city) {
	  this.city = city;
	 }

	 public void setLocation(String location) {
	  this.location = location;
	 }

	 public void setLatitude(String latitude) {
	  this.latitude = latitude;
	 }

	 public void setRegion(String region) {
	  this.region = region;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setPermalink(String permalink) {
	  this.permalink = permalink;
	 }
	
}
