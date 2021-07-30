package com.mobiquity.atm.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.atm.feignclient.ATMFeignClient;
import com.mobiquity.atm.model.ATMDetails;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Service
public class FeignClientATMServiceImpl implements FeignClientATMService
{
	@Autowired
	private ATMFeignClient atmFeignClient;
	
	@Override
	public List<ATMDetails> getATMDetails() throws JsonMappingException, JsonProcessingException
	{
		log.info("ATMServiceImpl getATMDetails starts..");
		List<ATMDetails> list = getATMDetailsForCommon();
		log.info("ATMServiceImpl getATMDetails end..");
		
		return list;
	}
	
	private List<ATMDetails> getATMDetailsForCommon() throws JsonMappingException, JsonProcessingException
	{
		log.info("ATMServiceImpl getATMDetailsForCommon starts..");
		String responseJSON = atmFeignClient.getATMDetaisl();
	    String json = responseJSON.replace(")]}',", "");
		ObjectMapper mapper = new ObjectMapper();
		ATMDetails[] atmDetails = mapper.readValue(json, ATMDetails[].class);
		log.info("ATMServiceImpl getATMDetailsForCommon end..");
		
		// Converting from Array to List
		return new ArrayList<ATMDetails>(Arrays.asList(atmDetails));
	}
}
