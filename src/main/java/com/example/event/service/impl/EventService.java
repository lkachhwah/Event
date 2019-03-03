package com.example.event.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.event.EventApplication;
import com.example.event.pojo.Categories;
import com.example.event.pojo.FeaturedEvents;
import com.example.event.pojo.Neighborhoods;
import com.example.event.service.IEventService;

@Service
public class EventService implements IEventService {

	@Override
	public List<Neighborhoods> getNeighborhoods() {
		return EventApplication.data.getSearch().getTabular().getFacets().getNeighborhoods();
	}

	@Override
	public List<Categories> getCategories() {
		return EventApplication.data.getSearch().getTabular().getFacets().getCategories();
	}

	@Override
	public List<FeaturedEvents> getSortedEvents(List<Categories> categorieList, List<Neighborhoods> locationList) {
		if (categorieList.isEmpty() && locationList.isEmpty())
			return sort(EventApplication.data.getSearch().getTabular().getEvents());
		return null;
	}

	private List<FeaturedEvents> sort(ArrayList<FeaturedEvents> events) {
		Comparator<FeaturedEvents> comparator = Comparator.comparing(f -> f.getStart_time());
		// comparator = comparator.thenComparing(other);
		events.sort(comparator);
		return events;
	}

}
