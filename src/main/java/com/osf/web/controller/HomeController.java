package com.osf.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping("/test")
	public String goTest(Model model) {
		model.addAttribute("msg", "안녕^_^");
		List<String> strList = new ArrayList<String>();
		
		return "test";
	}
}
