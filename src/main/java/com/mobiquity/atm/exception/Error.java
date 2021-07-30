package com.mobiquity.atm.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Error {

	private String code;
	private String message;
	private String details;
	
	public Error(final String code, final String message, final String details)
	{
		this.code = code;
		this.message = message;
		this.details = details;
	}
}
