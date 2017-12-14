package com.w.shop3.user.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.Cart;
import com.w.shop3.entiy.User;

@Repository
public class UserDAOImpl {

	@Resource
	private SessionFactory sf;
	
	/**
	 * 查找用户是否存在并返回对象
	 * @param name
	 * @return
	 */
	public User judge(String name) {
		String hql = "from User where userName = ?";
		Query q = this.sf.getCurrentSession().createQuery(hql);
		q.setParameter(0, name);
		User user = (User) q.uniqueResult();
		return user;
	}
	
	/**
	 * 向数据库写入用户信息
	 * @param u
	 */
	public void addUser(User u) {
		this.sf.getCurrentSession().save(u);
		Cart c = new Cart();
		c.setUser(u);
		this.sf.getCurrentSession().save(c);
	}
	
	/**
	 * 按用户名查找用户
	 * @param userName
	 * @return
	 */
	public User findUserByName(String userName) {
		Query q = this.sf.getCurrentSession().createQuery("from User where userName = ?");
		q.setParameter(0, userName);
		User u = (User) q.uniqueResult();
		return u;
	}
}
