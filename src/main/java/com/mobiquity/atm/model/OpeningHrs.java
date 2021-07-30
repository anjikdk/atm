package com.mobiquity.atm.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OpeningHrs {

	private Integer dayOfWeek;
	private List<Hours> hours;
}
