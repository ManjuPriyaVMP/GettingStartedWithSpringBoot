package com.springcloud.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdtController {

	@RequestMapping("/all")
	public String getStart() {
		return "Welcome to Mju training";
	}
}
