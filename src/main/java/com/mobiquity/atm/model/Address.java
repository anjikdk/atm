package com.mobiquity.atm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address {

	private String street;
	@JsonProperty(value = "housenumber")
	private String houseNumber;
	@JsonProperty(value = "postalcode")
	private String postalCode;
	private String city;
	private GEOLocation geoLocation;
}
