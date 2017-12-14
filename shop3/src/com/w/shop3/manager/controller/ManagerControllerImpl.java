package com.w.shop3.manager.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.w.shop3.manager.service.ManagerServiceImpl;

@Controller
@RequestMapping("manager")
public class ManagerControllerImpl {

	@Resource
	private ManagerServiceImpl msi;
	
	/**
	 * ����service�Ľ��������ͬ��Ӧ
	 * @param mName
	 * @param pwd
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/managerLogin",method=RequestMethod.POST)
	public String managerLogin(@RequestParam("managerName")String mName,
			@RequestParam("pwd")String pwd,Model model) throws IOException {
		String managerName = mName;
		String password = pwd;
		int i = this.msi.judgeIdentity(managerName, password);
		if(i == 1) {
			return "backstage/managehome";
		}
		if(i == -1) {
			model.addAttribute("nameError", "����Ա��������");
			return "backstage/managerlogin";
		}
		if(i == 0) {
			model.addAttribute("pwdError", "�������");
			return "backstage/managerlogin";
		}
		return null;
	}
}
