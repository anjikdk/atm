package com.mobiquity.atm.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atm.model.ATMDetails;
import com.mobiquity.atm.service.ATMServiceImpl;
import com.mobiquity.atm.util.ATMConstants;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ATMServiceTest {
	
	@InjectMocks
	ATMController atmController;
	
	@InjectMocks
	ATMServiceImpl atmService;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Test
	public void testGetATMDetails() throws JsonMappingException, JsonProcessingException 
	{
		String json = ")]}',\r\n" + 
				"[{\"address\":{\"street\":\"Kapellerweg\",\"housenumber\":\"3A\",\"postalcode\":\"5575 BG\",\"city\":\"Luyksgestel\",\"geoLocation\":{\"lat\":\"51.28898\",\"lng\":\"5.31971\"}},\"distance\":0,\"openingHours\":[{\"dayOfWeek\":2,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":3,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":4,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":5,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":6,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":7,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]},{\"dayOfWeek\":1,\"hours\":[{\"hourFrom\":\"07:00\",\"hourTo\":\"23:00\"}]}],\"functionality\":\"Geldautomaat\",\"type\":\"GELDMAAT\"}]";
		Mockito.when(restTemplate.getForObject(ATMConstants.uri, String.class)).thenReturn(json);
		List<ATMDetails> list = atmService.getATMDetails();
		Assert.assertNotNull(list);
	}
}
