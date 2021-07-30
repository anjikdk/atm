package com.mobiquity.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atm.model.ATMDetails;
import com.mobiquity.atm.service.ATMService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ATMController 
{
	@Autowired
	private ATMService atmService;

	@GetMapping("/atms")
	public List<ATMDetails> getATMDetails() throws JsonMappingException, JsonProcessingException
	{
		log.info("ATMController getATMDetails starts..");
		List<ATMDetails> list = atmService.getATMDetails();
		log.info("ATMController getATMDetails end..");
		
		return list;
	}
	
	@GetMapping("/atms/{city}")
	public List<ATMDetails> getATMDetailsByCity(@PathVariable("city") String city) throws JsonMappingException, JsonProcessingException
	{
		log.info("ATMController getATMDetailsByCity starts..");
		List<ATMDetails> list = atmService.getATMDetailsByCity(city);
		log.info("ATMController getATMDetailsByCity end..");
		return list;
	}
}
