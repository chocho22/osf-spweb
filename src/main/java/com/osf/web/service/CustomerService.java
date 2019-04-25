package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerService {
	public List<Map<String,String>> selectCustomerList();
	public Map<String,String> selectCustomer(Map<String,String> customer);
	public int insertCustomer(Map<String,String> joinCustomer);
	public int updateCustomer(Integer ciNum);
	public int deleteCustomer(Integer ciNum);
}
