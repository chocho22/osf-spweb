package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerDAO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Map<String, String>> selectCustomerList() {
		return ss.selectList("customer.selectCustomerList");
	}

	@Override
	public Map<String, String> selectCustomer(Map<String, String> customer) {
		return null;
	}

	@Override
	public int insertCustomer(Map<String,String> joinCustomer) {
		return ss.insert("customer.insertCustomer",joinCustomer);
	}

	@Override
	public int updateCustomer(Integer ciNum) {
		return 0;
	}

	@Override
	public int deleteCustomer(Integer ciNum) {
		return 0;
	}

}
