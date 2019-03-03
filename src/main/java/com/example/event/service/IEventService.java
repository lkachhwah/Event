package com.example.event.service;

import java.util.ArrayList;
import java.util.List;

import com.example.event.pojo.Categories;
import com.example.event.pojo.Featured_events;
import com.example.event.pojo.Neighborhoods;

public interface IEventService {

	ArrayList<Neighborhoods> getNeighborhoods();

	ArrayList<Categories> getCategories();

	ArrayList<Featured_events> getSortedEvents(List<Categories> categorieList, List<Neighborhoods> locationList);

}
