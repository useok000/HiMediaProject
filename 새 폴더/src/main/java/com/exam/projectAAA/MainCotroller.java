package com.exam.projectAAA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCotroller {

	@RequestMapping("/")
	public String subpage1() {
		return "subpage1";
	}
	
	
}
