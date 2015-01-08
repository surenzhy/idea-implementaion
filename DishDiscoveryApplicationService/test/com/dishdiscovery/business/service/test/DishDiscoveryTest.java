package com.dishdiscovery.business.service.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dishdiscovery.business.service.IDishDiscoveryService;

public class DishDiscoveryTest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dishdiscovery-service-context.xml");
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetAllCategories() {
		IDishDiscoveryService dishDiscoveryService = ctx.getBean(IDishDiscoveryService.class);
		dishDiscoveryService.getAllDishCategories();
	}

}
