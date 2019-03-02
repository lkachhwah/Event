package com.example.event.pojo;

public class Location {

	 private String geo_ip_fail;
	 private String location_type;
	 private String location_id;
	 private String geo_ip_guess;
	 private Emu emu;
	 private String meta_name;
	 private String pretty_name;


	 // Getter Methods 

	 public String getGeo_ip_fail() {
	  return geo_ip_fail;
	 }

	 public String getLocation_type() {
	  return location_type;
	 }

	 public String getLocation_id() {
	  return location_id;
	 }

	 public String getGeo_ip_guess() {
	  return geo_ip_guess;
	 }


	 public String getMeta_name() {
	  return meta_name;
	 }

	 public String getPretty_name() {
	  return pretty_name;
	 }

	 // Setter Methods 

	 public void setGeo_ip_fail(String geo_ip_fail) {
	  this.geo_ip_fail = geo_ip_fail;
	 }

	 public void setLocation_type(String location_type) {
	  this.location_type = location_type;
	 }

	 public void setLocation_id(String location_id) {
	  this.location_id = location_id;
	 }

	 public void setGeo_ip_guess(String geo_ip_guess) {
	  this.geo_ip_guess = geo_ip_guess;
	 }


	 public void setMeta_name(String meta_name) {
	  this.meta_name = meta_name;
	 }

	 public void setPretty_name(String pretty_name) {
	  this.pretty_name = pretty_name;
	 }

	@Override
	public String toString() {
		return "Location [geo_ip_fail=" + geo_ip_fail + ", location_type=" + location_type + ", location_id="
				+ location_id + ", geo_ip_guess=" + geo_ip_guess + ", emu=" + emu + ", meta_name=" + meta_name
				+ ", pretty_name=" + pretty_name + "]";
	}
	
}
