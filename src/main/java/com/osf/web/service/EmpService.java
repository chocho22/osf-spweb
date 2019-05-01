package com.osf.web.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface EmpService {
	boolean loginEmp(Map<String,String> emp, HttpSession hs);
}
