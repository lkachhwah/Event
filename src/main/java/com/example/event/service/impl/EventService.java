package com.example.event.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.event.EventApplication;
import com.example.event.pojo.Categories;
import com.example.event.pojo.FeaturedEvents;
import com.example.event.pojo.Neighborhoods;
import com.example.event.service.IEventService;

@Service
public class EventService implements IEventService{

	@Override
	public ArrayList<Neighborhoods> getNeighborhoods() {
		return EventApplication.data.getSearch().getTabular().getFacets().getNeighborhoods();
	}

	@Override
	public ArrayList<Categories> getCategories() {
		return EventApplication.data.getSearch().getTabular().getFacets().getCategories();
	}

	@Override
	public ArrayList<FeaturedEvents> getSortedEvents(List<Categories> categorieList, List<Neighborhoods> locationList) {
		if(categorieList.isEmpty() && locationList.isEmpty()) return EventApplication.data.getSearch().getTabular().getEvents();
		return null;
	}

}
