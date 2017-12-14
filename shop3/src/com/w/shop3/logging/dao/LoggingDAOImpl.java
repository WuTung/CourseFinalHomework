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
	* 向数据库表中添加登录日志
	* 通过传入参数User对象填充外键
	* 通过Date获取当前时间
	* @param u true
	* @return 没有返回值
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
