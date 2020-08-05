package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import util.Utils;

import com.pojo.Article;
import com.pojo.PageParm;
import com.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService=null;
	
	@RequestMapping("article/articlePush.do")
	@ResponseBody
	public String articlePush(Article art){
		articleService.insertArticle(art);
		return "true";
	}
	
	@RequestMapping("article/articleList.do")
	@ResponseBody
	public HashMap<String, Object> articleSearch(PageParm pageparm){
		System.out.println(pageparm);
		HashMap<String, Object> map=Utils.getHashMap();
		map.put("keyword", pageparm.getKeyword());
		map.put("type", pageparm.getType());
		map.put("catstart", pageparm.getCatstart());
		map.put("pagesize", pageparm.getPagesize());
		List<Article> list=articleService.selectArticleByCondition(map);
		int count=articleService.selectArticleCountByCondition(map);
		HashMap<String, Object> resultmap=Utils.getHashMap();
		resultmap.put("count", count);
		resultmap.put("data", list);
		return resultmap;
	}
	
	@RequestMapping("article/articleDetails.do")
	@ResponseBody
	public HashMap<String, Object> articleDetails(String articleid){
		System.out.println(articleid);
		Article article=articleService.selectArticleById(articleid);
		HashMap<String, Object> resultmap=Utils.getHashMap();
		resultmap.put("data", article);
		return resultmap;
	}
	
	@RequestMapping("test.do")
	@ResponseBody
	public PageParm test(String parm){
		try {
			String content =java.net.URLDecoder.decode(parm,"UTF-8");
			System.out.println(content);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PageParm p=new PageParm();
		p.setCatstart(1);
		p.setKeyword("221312");
		p.setPagesize(2);
		p.setType("2131");
		return p;
	}
}
