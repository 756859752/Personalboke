package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import util.Utils;
import DTO.Questions;

import com.pojo.Branchapp;
import com.pojo.PageParm;
import com.pojo.Question;
import com.pojo.Ttapp;
import com.service.TtappService;

@Controller
public class TtappController {

	@Autowired
	TtappService ttappService=null;
	
	//查询通用目录
	@RequestMapping("ttapp/findTtapp.do")
	@ResponseBody
	public Map findTtapp(PageParm pageparm){
		
		HashMap<String, Object> map=	Utils.getHashMap();
		map.put("catstart",pageparm.getCatstart());
		map.put("pagesize", pageparm.getPagesize());
		List<Ttapp>list=ttappService.selectTtappByCondition(map);
			
		HashMap<String, Object> resultmap=	Utils.getHashMap();
		resultmap.put("data", list);
		resultmap.put("error", "");

		return resultmap;
	}
	
	//通用目录录入
	@RequestMapping("ttapp/addTtapp.do")
	@ResponseBody
	public String addTtapp(Ttapp ttapp){
		System.out.println(ttapp);
		ttappService.insertTtapp(ttapp);
		return "true";
	}
	//基础信息表单
	@RequestMapping("ttapp/addBranchappBaseForm.do") 
	@ResponseBody
	public String addBranchappBaseForm(HttpSession session,Branchapp ttapp ){ 
//		session.setAttribute("baseform", baseform);
		System.out.println(ttapp);
		return "true";
	}
	
	//录入分支（图片文件）
	@RequestMapping("ttapp/addBranchapp.do")
	@ResponseBody
	public String addBranchapp(Branchapp ttapp,Branchapp branchapp, @RequestParam("images") MultipartFile[]  images,
			@RequestParam("background1") MultipartFile background1,
			@RequestParam("background2") MultipartFile background2,
			HttpServletRequest request,HttpSession session){
		System.out.println(ttapp);
		String path=request.getSession().getServletContext().getRealPath("upload");
		String id=new Date().getTime()+"";
		 path=path+"//"+id;
		 
		File folder=new File(path);
		File parentfile=folder.getParentFile();
		//总文件夹
		if(!parentfile.exists() && !parentfile.isDirectory()){
		    //文件夾不存在時创建文件夾
			parentfile.mkdirs();
		}
		
		//该项目文件夹
		if(!folder.exists() && !folder.isDirectory()){
		    //文件夾不存在時创建文件夾
		    folder.mkdirs();
		}
		
		//结果文件夹
		String resultpath=path+"//reasult";
		File resultfolder=new File(resultpath);
		if(!resultfolder.exists() && !resultfolder.isDirectory()){
		    //文件夾不存在時创建文件夾
			resultfolder.mkdirs();
		}
		
		//结果
		int recount=0;
		for (MultipartFile image : images) {
			String filename="reasult"+recount;
			recount++;
			File filepath=new File(resultfolder,filename);
			try {
				image.transferTo(filepath);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//背景1
		
		String filename1=background1.getOriginalFilename();
		File filepath1=new File(path,filename1);
		try {
			background1.transferTo(filepath1);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//背景2
		String filename2=background2.getOriginalFilename();
		File filepath2=new File(path,filename2);
		try {
			background2.transferTo(filepath2);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		background1.transferTo(dest);
		return "true";
	}
}
