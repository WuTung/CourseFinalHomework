package com.w.shop3.manager.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.Manager;

@Repository
public class ManagerDAOImpl {

	@Resource
	private SessionFactory sf;
	
	/**
	 * 查询数据库中是否存在某个管理员的信息并将结果作为对象返回
	 * @param managerName
	 * @return
	 */
	public Manager judgeIdentity(String managerName) {
		Query q = this.sf.getCurrentSession().createQuery("from Manager where managerName = ?");
		q.setParameter(0, managerName);
		Manager m = (Manager) q.uniqueResult();
		return m;
	}
}
