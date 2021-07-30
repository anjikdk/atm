package com.mobiquity.atm.feignclient;

import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value = "atm", url = "https://www.ing.nl/api/locator/atms")
public interface ATMFeignClient {

	@GetMapping("/")
	public String getATMDetaisl();
}
