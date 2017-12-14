package com.w.shop3.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.entiy.User;
import com.w.shop3.user.dao.UserDAOImpl;

@Service
@Transactional
public class UserServiceImpl {

	@Resource
	private UserDAOImpl udi;
	
	/**
	 * 处理用户身份查询结果
	 * @param name
	 * @param pwd
	 * @return
	 */
	public int judge(String name,String pwd) {
		User user =  this.udi.judge(name);
		if(user == null) {
			return 0;
		}else {
			if(user.getPwd().equals(pwd)) {
				return 1;
			}else {
				return -1;
			}
		}
	}
	
	/**
	 * 调用添加用户方法
	 * @param u
	 */
	public void addUser(User u) {
		this.udi.addUser(u);
	}
	
	/**
	 * 查找用户并接收结果
	 * @param userName
	 * @return
	 */
	public User findUserByName(String userName) {
		return this.udi.findUserByName(userName);
	}
}
