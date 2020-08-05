package com.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import util.Utils;

import com.mapper.ArticleMapper;
import com.pojo.Article;
import com.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper articleMapper=null;
	
	@Override
	public void insertArticle(Article Article) {
		// TODO Auto-generated method stub
		Article.setPushdate(new Date());
		Article.setArticleid(Utils.getNewID());
		articleMapper.insertArticle(Article);
	}

	@Override
	public void deleteArticle(String Articleid) {
		// TODO Auto-generated method stub
		articleMapper.deleteArticle(Articleid);
	}

	@Override
	public void updateArticle(Article Article) {
		// TODO Auto-generated method stub
		articleMapper.updateArticle(Article);
	}

	@Override
	public Article selectArticleById(String Articleid) {
		// TODO Auto-generated method stub
		return articleMapper.selectArticleById(Articleid);
	}


	@Override
	public List<Article> selectArticleByCondition(
			HashMap<String, Object> hashmap) {
		// TODO Auto-generated method stub
		return articleMapper.selectArticleByCondition(hashmap);
	}

	@Override
	public Integer selectArticleCountByCondition(
			HashMap<String, Object> hashmap) {
		// TODO Auto-generated method stub
		return articleMapper.selectArticleCountByCondition(hashmap);
	}
	
}
