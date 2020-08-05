package com.service;

import java.util.HashMap;
import java.util.List;

import com.pojo.Article;

public interface ArticleService {
	public void insertArticle(Article Article);
	public void deleteArticle(String Articleid);
	public void updateArticle(Article Article);
	public Article selectArticleById(String Articleid);
	public Integer selectArticleCountByCondition(HashMap<String, Object> hashmap);
	public List<Article> selectArticleByCondition(HashMap<String, Object> hashmap);
}
