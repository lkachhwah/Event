package com.example.event.service;

import java.util.ArrayList;
import java.util.List;

import com.example.event.pojo.Categories;
import com.example.event.pojo.Cities;
import com.example.event.pojo.FeaturesEvents;
import com.example.event.pojo.Neighborhoods;

public interface IEventService {

	List<Neighborhoods> getNeighborhoods();

	List<Categories> getCategories();

	List<Cities> getCities();

	List<FeaturesEvents> getSortedEvents(ArrayList<String> categories, String neighborhood2, String city)
			throws Exception;

}
