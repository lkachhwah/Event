package com.example.event.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.event.EventApplication;
import com.example.event.pojo.Categories;
import com.example.event.pojo.Neighborhoods;

@Service
public class EventService {

	public ArrayList<Neighborhoods> getNeighborhoods() {
		return EventApplication.data.getSearch().getTabular().getFacets().getNeighborhoods();
	}

	public ArrayList<Categories> getCategories() {
		return EventApplication.data.getSearch().getTabular().getFacets().getCategories();
	}

	public void getSortedEvents(List<Categories> categorieList, List<Neighborhoods> locationList) {
		// TODO Auto-generated method stub
		
	}

}
