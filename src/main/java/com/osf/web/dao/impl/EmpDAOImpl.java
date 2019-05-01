package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.EmpDAO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public Map<String, String> selectEmpById(Map<String, String> emp) {
		return ss.selectOne("emp.selectEmpById",emp);
	}

	@Override
	public List<Map<String, String>> selectEmpList(Map<String, String> emp) {
		return ss.selectList("emp.selectEmpList",emp);
	}
}
