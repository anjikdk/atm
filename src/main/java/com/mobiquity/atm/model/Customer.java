package com.mobiquity.atm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Integer custId;
	private Integer phone;
	private String fname;
	private String lname;
	private String creditCard;
	
	
}
