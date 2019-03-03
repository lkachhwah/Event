package com.example.event.service;

import java.util.List;

import com.example.event.pojo.Categories;
import com.example.event.pojo.FeaturedEvents;
import com.example.event.pojo.Neighborhoods;

public interface IEventService {

	List<Neighborhoods> getNeighborhoods();

	List<Categories> getCategories();

	List<FeaturedEvents> getSortedEvents(List<Categories> categorieList, List<Neighborhoods> locationList);

}
