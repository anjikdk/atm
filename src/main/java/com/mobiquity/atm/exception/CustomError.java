package com.mobiquity.atm.exception;

public class CustomError {

	private String messgae;
	private int status;
	
	public CustomError(String messgae, int status) {
		this.messgae = messgae;
		this.status = status;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
