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
	 * �����û��Ƿ���ڲ����ض���
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
	 * �����ݿ�д���û���Ϣ
	 * @param u
	 */
	public void addUser(User u) {
		this.sf.getCurrentSession().save(u);
		Cart c = new Cart();
		c.setUser(u);
		this.sf.getCurrentSession().save(c);
	}
	
	/**
	 * ���û��������û�
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
