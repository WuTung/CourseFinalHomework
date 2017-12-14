package com.w.shop3.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.w.shop3.entiy.User;
import com.w.shop3.logging.service.LoggingServiceImpl;
import com.w.shop3.user.service.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserControllerImpl {
	
	@Resource
	private UserServiceImpl usi;
	@Resource
	private LoggingServiceImpl lsi;
	
	/**
	 * 判断用户是否合法,登录成功添加登录日志
	 * @param name
	 * @param pwd
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/judge",method=RequestMethod.POST)
	public String judge(@RequestParam("userName")String name,@RequestParam("pwd")String pwd,
			Model model,HttpSession session) {
		int i = this.usi.judge(name, pwd);
		if(i == 1) {
			session.setAttribute("userName", name);
			User u = this.usi.findUserByName(name);
			this.lsi.addUserLogging(u);
			return "front/home";
		}
		if(i == 0) {
			model.addAttribute("userError", "用户名不存在");
			return "front/index";
		}
		if(i == -1) {
			model.addAttribute("pwdError", "密码错误");
			return "front/index";
		}
		return null;
	}
	
	/**
	 * 注册用户
	 * @param userName
	 * @param pwd
	 * @param email
	 * @param address
	 * @param avatar
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@RequestParam("userName")String userName,@RequestParam("pwd")String pwd,
			@RequestParam("email")String email,@RequestParam("address")String address,
			@RequestParam("avatar")String avatar,Model model) {
		String imgurl = "../static/images/";
		if(avatar.contains("\\")) {
			imgurl = "../static/images/" + avatar.substring(avatar.lastIndexOf("\\"));
		}else {
			imgurl = "../static/images/" + avatar;
		}
		if(this.usi.findUserByName(userName) == null) {
			User u = new User();
			u.setUserName(userName);
			u.setPwd(pwd);
			u.setEmail(email);
			u.setAddress(address);
			u.setAvatar(imgurl);
			this.usi.addUser(u);
			return "front/index";
		}else {
			model.addAttribute("userNameError", "用户名已存在");
			return "front/regist";
		}	
	}
	
	/**
	 * 查找用户
	 * @param userName
	 * @return
	 */
	@RequestMapping("/findUserByName")
	public User findUserByName(String userName) {
		 return this.usi.findUserByName(userName);
	}
}
