package com.mobiquity.atm.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ATMDetails {

	private Address address;
	private Integer distance;
	private List<OpeningHrs> openingHours;
	private String functionality;
	private String type;
}
