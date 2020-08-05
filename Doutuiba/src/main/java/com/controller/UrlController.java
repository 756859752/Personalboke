package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UrlController {
	@RequestMapping("page/ttapp/{url}/find.do")
	public String findUrl(@PathVariable("url") String url,HttpSession session){
		System.out.println("进入了");
		Object userobj=session.getAttribute("user");
//		if(userobj==null){
//			return "forward:/html/202.html";
//		}
		String path="forward:/ttapp/"+url;
		System.out.println(path);
		return path;
	}
}
