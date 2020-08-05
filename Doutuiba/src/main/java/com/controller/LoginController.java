package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.User;

/**
 * 登录管理器
 * 所有需要登录的页面必须先经过登录管理器
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping("login/islogin.do")
	@ResponseBody
	public String isLogin(HttpSession session){
		Object userobj=session.getAttribute("user");
		if(userobj==null){
			return "false";
		}
		return "true";
	}
}
