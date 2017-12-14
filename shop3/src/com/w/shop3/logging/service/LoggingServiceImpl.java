package com.w.shop3.logging.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.entiy.User;
import com.w.shop3.logging.dao.LoggingDAOImpl;

@Service
@Transactional
public class LoggingServiceImpl {

	@Resource
	private LoggingDAOImpl ldi;
	
	/**
	* 向数据库表中添加登录日志
	* 调用dao里的addUserLogging()方法
	* @param u true 
	* @return 没有返回值
	*/
	public void addUserLogging(User u) {
		this.ldi.addUserLogging(u);
	}
}
