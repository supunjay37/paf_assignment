package com.paf.rest.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controll {
	@RequestMapping("/")
	public String start() {
		return"index";
	}

}
