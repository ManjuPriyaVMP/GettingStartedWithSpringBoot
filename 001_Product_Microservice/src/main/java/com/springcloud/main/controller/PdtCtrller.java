package com.springcloud.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdtCtrller {

	@RequestMapping("/")
	public String onStart() {
		return "Welcome to Mju's learning";
	}
}
