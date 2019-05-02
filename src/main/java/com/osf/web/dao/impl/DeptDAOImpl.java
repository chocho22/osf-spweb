package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.DeptDAO;

@Repository
public class DeptDAOImpl implements DeptDAO {
	
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Map<String, String>> selectDeptList() {
		return ss.selectList("depart.selectDepartList");
	}
}
