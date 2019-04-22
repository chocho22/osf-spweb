package com.osf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {
	public String str = "11";
	
	public static void main(String[] args) {
		String str = null;
		if("이초롱".equals(str)) {
			log.info("이름은 이초롱이 맞습니다^_^");
		} else {
			log.debug("나도 나오려나???");
			log.info("이름은 이초롱이 아닙니다^_^");
		}
		log.warn("프로그램 비정상 종료, 그치만 문제는 없음.");
	}
}
