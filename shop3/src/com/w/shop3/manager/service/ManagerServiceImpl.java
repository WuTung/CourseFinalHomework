package com.w.shop3.manager.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.entiy.Manager;
import com.w.shop3.manager.dao.ManagerDAOImpl;

@Service
@Transactional
public class ManagerServiceImpl {

	@Resource
	private ManagerDAOImpl mdi;
	
	/**
	 * 对数据库查询结果进行加工传递
	 * @param managerName
	 * @param pwd
	 * @return
	 */
	public int judgeIdentity(String managerName,String pwd) {
		Manager m = this.mdi.judgeIdentity(managerName);
		if(m == null) {
			return -1;
		}else {
			if(m.getManagerPwd().equals(pwd)) {
				return 1;
			}else {
				return 0;
			}
		}
	}
}
