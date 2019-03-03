package com.example.event.controller;

import static com.example.event.pojo.EventConstant.API_ENDPOINT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.event.pojo.Categories;
import com.example.event.pojo.FeaturedEvents;
import com.example.event.pojo.Neighborhoods;
import com.example.event.service.impl.EventService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;;

@RestController
@RequestMapping(API_ENDPOINT)

@Api(value = API_ENDPOINT, description = "Event Details", produces = "application/json")
public class EventController {

	private static Logger logger = Logger.getLogger(EventController.class.getName());

	@Autowired
	EventService eventService;

	@GetMapping("locations")
	@ApiOperation(value=" This api is used to get the event location")
	public ArrayList<Neighborhoods> getNeighborhoods() {
		return eventService.getNeighborhoods();
	}

	@GetMapping("categories")
	@ApiOperation(value=" This api is used to get the event categories")
	public ArrayList<Categories> getCategories() {
		return eventService.getCategories();
	}

	@GetMapping("/events")
	@ApiOperation(value=" This api is used to get the event based on categories and location",notes= "To get the cotegories use 'GET /api/event/categorie'and location use GET /api/event/locations '' ")
	public ArrayList<FeaturedEvents> handleSubscriptions(@ApiParam(value= "categories can be multiple comma seprated string, you can pass id or name")@RequestParam(value = "categories", required = false) ArrayList<String> categories,
			@ApiParam(value= "location can be single string value, you cna pass id or name")@RequestParam(value = "location", required = false) String location) throws Exception {
		List<Neighborhoods> locationList = validateLocation(location);
		List<Categories> categorieList = new ArrayList<>();
		if (categories != null) {
			categorieList = validateCategories(categories);
		}
		categorieList.forEach(c -> logger.info(c.toString()));
		logger.info(location);
		return eventService.getSortedEvents(categorieList, locationList);
	}

	private List<Categories> validateCategories(Collection<String> categories) {
		return getCategories().stream()
				.filter(e -> (categories.stream()
						.filter(d -> (e.getName().equalsIgnoreCase(String.valueOf(d))
								|| e.getCategory_id().equalsIgnoreCase(String.valueOf(d))))
						.count()) < 1)
				.collect(Collectors.toList());
	}

	private List<Neighborhoods> validateLocation(String location) {
		return getNeighborhoods().stream().filter(c -> (location != null
				&& (c.getName().equalsIgnoreCase(location) || c.getNeighborhood_id().equalsIgnoreCase(location))))
				.collect(Collectors.toList());
	}
}
