package com.example.event.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.EventApplication;
import com.example.event.pojo.Categories;
import com.example.event.pojo.Cities;
import com.example.event.pojo.Data;
import com.example.event.pojo.FeaturedEvents;
import com.example.event.pojo.FeaturesEvents;
import com.example.event.pojo.Neighborhoods;
import com.example.event.service.IEventService;
import com.example.event.util.Constant;

@Service
public class EventService implements IEventService {

	@Autowired
	private ConnectionsServiceImpl connectionsServiceImpl;

	@Override
	public List<Neighborhoods> getNeighborhoods() {
		return EventApplication.data.getSearch().getTabular().getFacets().getNeighborhoods();
	}

	@Override
	public List<Categories> getCategories() {
		return EventApplication.data.getSearch().getTabular().getFacets().getCategories();
	}

	@Override
	public List<FeaturesEvents> getSortedEvents(ArrayList<String> categories, String neighborhood, String city)
			throws Exception {
		List<FeaturesEvents> featuresEventList = new ArrayList<>();
		StringJoiner stringJoiner = new StringJoiner("&");
		if (city != null)
			stringJoiner.add("location=" + city);
		if (neighborhood != null)
			stringJoiner.add("neighborhood=" + neighborhood);
		for (String category : categories) {
			FeaturesEvents events = new FeaturesEvents();
			events.setCategoryName(category);
			String queryParam = Constant.FACLET_QUERY + "&category=" + category + "&" + stringJoiner.toString();

			Data data = connectionsServiceImpl.loadData(queryParam);
			if (data != null && data.getSearch() != null && data.getSearch().getTabular() != null
					&& !data.getSearch().getTabular().getEvents().isEmpty())
				events.setFeaturedEvents(sort(data.getSearch().getTabular().getEvents()));
			featuresEventList.add(events);
		}
		Comparator<FeaturesEvents> comparator = Comparator.comparing(f -> f.getCategoryName());
		featuresEventList.sort(comparator);
		return featuresEventList;
	}

	private List<FeaturedEvents> sort(ArrayList<FeaturedEvents> events) {
		Comparator<FeaturedEvents> comparator = Comparator.comparing(f -> f.getStart_time());
		// comparator = comparator.thenComparing(other);
		events.sort(comparator);
		return events;
	}

	@Override
	public List<Cities> getCities() {
		return EventApplication.data.getSearch().getTabular().getFacets().getCities();
	}

}
