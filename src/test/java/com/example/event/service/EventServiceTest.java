package com.example.event.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.event.pojo.Categories;
import com.example.event.pojo.Neighborhoods;
import com.example.event.service.impl.EventService;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class EventServiceTest {

	@InjectMocks
	EventService eventService;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetNeighborhoods() throws Exception {
		List<Neighborhoods> test = eventService.getNeighborhoods();
		System.out.println(test);
		Assert.assertTrue(test != null);
	}

	@Test
	public void testGetCategories() throws Exception {
		List<Categories> test = eventService.getCategories();
		System.out.println(test);
		Assert.assertTrue(test != null);
	}

}
