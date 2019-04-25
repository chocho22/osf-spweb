package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerDAO {
	public List<Map<String,String>> selectCustomerList();
	public Map<String,String> selectCustomer(Map<String,String> customer);
	public int insertCustomer(Map<String,String> joinCustomer);
	public int updateCustomer(Integer ciNum);
	public int deleteCustomer(Integer ciNum);
}
