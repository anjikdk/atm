package com.mobiquity.atm.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobiquity.atm.model.ATMDetails;

public interface FeignClientATMService {

	public List<ATMDetails> getATMDetails() throws JsonMappingException, JsonProcessingException;
}
