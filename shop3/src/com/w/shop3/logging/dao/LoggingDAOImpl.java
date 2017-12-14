package com.w.shop3.logging.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.Logging;
import com.w.shop3.entiy.User;

@Repository
public class LoggingDAOImpl {
	
	@Resource
	private SessionFactory sf;

	/**
	* �����ݿ������ӵ�¼��־
	* ͨ���������User����������
	* ͨ��Date��ȡ��ǰʱ��
	* @param u true
	* @return û�з���ֵ
	*/
	public void addUserLogging(User u) {
		Logging l = new Logging();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		l.setLoginTime(sdf.format(d));
		u.getlSet().add(l);
		this.sf.getCurrentSession().save(l);
	}
}
