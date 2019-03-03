package com.example.event.controller;

import static com.example.event.pojo.EventConstant.API_ENDPOINT;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.event.pojo.Categories;
import com.example.event.pojo.Cities;
import com.example.event.pojo.FeaturesEvents;
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

	@GetMapping("neighborhoods")
	@ApiOperation(value = " This api is used to get the event location Neighborhoods")
	public List<Neighborhoods> getNeighborhoods() {
		logger.info("get neighborhoods list");
		return eventService.getNeighborhoods();
	}

	@GetMapping("cities")
	@ApiOperation(value = " This api is used to get the event location cities")
	public List<Cities> getCities() {
		logger.info("get cities list");
		return eventService.getCities();
	}

	@GetMapping("categories")
	@ApiOperation(value = " This api is used to get the event categories")
	public List<Categories> getCategories() {
		logger.info("get categories list");
		return eventService.getCategories();
	}

	@GetMapping("/events")
	@ApiOperation(value = " This api is used to get the event based on categories and location", notes = "To get the cotegories use 'GET /api/event/categorie'and location use GET /api/event/locations '' ")
	public List<FeaturesEvents> eventsByCategory(
			@ApiParam(value = "categories can be multiple comma seprated string, you can pass id ") @RequestParam(value = "categories", required = false) ArrayList<String> categories,
			@ApiParam(value = "location Neighborhoods can be single string value, you can pass id") @RequestParam(value = "neighborhoods", required = false) String neighborhood,
			@ApiParam(value = "location Cities can be single string value, you can pass id") @RequestParam(value = "cities", required = false) String city)
			throws Exception {
		logger.info("get events list");
		logger.info("request neighborhood:" + neighborhood);
		logger.info("requested city:" + city);
		logger.info("requested category:" + categories);
		return eventService.getSortedEvents(categories, neighborhood, city);
	}

}
