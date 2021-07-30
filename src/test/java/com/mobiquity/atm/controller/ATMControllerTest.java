package com.mobiquity.atm.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atm.model.ATMDetails;
import com.mobiquity.atm.service.ATMService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ATMControllerTest {
	
	@InjectMocks
	ATMController atmController;
	
	@Mock
	ATMService atmService;

	@Test
	public void testGetATMDetails() throws JsonMappingException, JsonProcessingException 
	{
		List<ATMDetails> list = atmController.getATMDetails();
		Assert.assertNotNull(list);
	}
}
