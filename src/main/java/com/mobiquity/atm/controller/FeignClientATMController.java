package com.mobiquity.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atm.model.ATMDetails;
import com.mobiquity.atm.service.FeignClientATMService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FeignClientATMController {

//	@Autowired
//	private FeignClientATMService feignClientATMService;

	@GetMapping("/getatms")
	public List<ATMDetails> getATMDetails() throws JsonMappingException, JsonProcessingException
	{
		log.info("FeignClientATMController getATMDetails starts..");
//		List<ATMDetails> list = feignClientATMService.getATMDetails();
		log.info("FeignClientATMController getATMDetails end..");
		
		return null;
	}
	
}
