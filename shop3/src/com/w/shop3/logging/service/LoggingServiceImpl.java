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
	* �����ݿ������ӵ�¼��־
	* ����dao���addUserLogging()����
	* @param u true 
	* @return û�з���ֵ
	*/
	public void addUserLogging(User u) {
		this.ldi.addUserLogging(u);
	}
}
