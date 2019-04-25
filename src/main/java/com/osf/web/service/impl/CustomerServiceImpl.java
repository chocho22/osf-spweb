package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.CustomerDAO;
import com.osf.web.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO cdao;
	
	@Override
	public List<Map<String, String>> selectCustomerList() {
		return cdao.selectCustomerList();
	}

	@Override
	public Map<String, String> selectCustomer(Map<String, String> customer) {
		return cdao.selectCustomer(customer);
	}

	@Override
	public int insertCustomer(Map<String,String> joinCustomer) {
		return cdao.insertCustomer(joinCustomer);
	}

	@Override
	public int updateCustomer(Integer ciNum) {
		return cdao.updateCustomer(ciNum);
	}

	@Override
	public int deleteCustomer(Integer ciNum) {
		return cdao.deleteCustomer(ciNum);
	}

}
