package com.org.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/gateway")
public class GateWayController {

	@GetMapping
	public String gateWay() {
		return "Config server is up!!!";
	}

}
