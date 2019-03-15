package com.boxcat.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexPageController {

	@RequestMapping("hello")
	public String hello() {
		return "SpringBoot Hello";
	}
}
