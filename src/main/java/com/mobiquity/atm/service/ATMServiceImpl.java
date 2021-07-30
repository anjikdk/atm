package com.mobiquity.atm.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.atm.model.ATMDetails;
import com.mobiquity.atm.util.ATMConstants;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ATMServiceImpl implements ATMService
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<ATMDetails> getATMDetails() throws JsonProcessingException
	{
		log.info("ATMServiceImpl getATMDetails starts..");
		List<ATMDetails> list = getATMDetailsForCommon();
		log.info("ATMServiceImpl getATMDetails end..");
		
		return list;
	}

	@Override
	public List<ATMDetails> getATMDetailsByCity(String city) throws JsonProcessingException 
	{
		log.info("ATMServiceImpl getATMDetailsByCity starts..");
		List<ATMDetails> list = getATMDetailsForCommon();
		// Filter the list of objects based on City
		List<ATMDetails> filteredList = list.stream().filter(atm -> atm.getAddress().getCity().equals(city)).collect(Collectors.toList());
		log.info("ATMServiceImpl getATMDetailsByCity end..");
		
		return filteredList;
	}
	
	private List<ATMDetails> getATMDetailsForCommon() throws JsonProcessingException
	{
		log.info("ATMServiceImpl getATMDetailsForCommon starts..");
		String responseJSON = restTemplate.getForObject(ATMConstants.uri, String.class);
	    String json = responseJSON.replace(")]}',", "");
		ObjectMapper mapper = new ObjectMapper();
		ATMDetails[] atmDetails = mapper.readValue(json, ATMDetails[].class);
		log.info("ATMServiceImpl getATMDetailsForCommon end..");
		
		// Converting from Array to List
		return new ArrayList<>(Arrays.asList(atmDetails));
	}
}
