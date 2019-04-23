package com.osf.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

@Repository
public class AddrDAOImpl implements AddrDAO {
	@Autowired
	private SqlSessionFactory ssf;

	@Override
	public List<Map<String, String>> selectAddrList() {
		SqlSession ss = ssf.openSession();
		Map<String,String> param = new HashMap<String,String>();
		param.put("adNum", "50");
		param.put("adSido", "부산광역시");
		return ss.selectList("addr.selectAddrList",param);
	}
}
