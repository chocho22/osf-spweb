package com.osf.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.osf.web.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@RequestMapping(value="/customer/list", method=RequestMethod.GET)
	public String goCustomerList(Model m) {
		m.addAttribute("customerList",cs.selectCustomerList());
		return "/view/customer/list";
	}
	
	@RequestMapping(value="/customer/insert", method=RequestMethod.POST)
	public String joinCustomer(Model m, @RequestParam Map joinCustomer) {
		m.addAttribute("joinCustomer",cs.insertCustomer(joinCustomer));
		return "/view/customer/insert";
	}
}
