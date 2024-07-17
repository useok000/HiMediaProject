package com.exam.prog_Ev17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";	
	}
	
	@RequestMapping("/community")
	public String community() {
		return "community";
	}
}
