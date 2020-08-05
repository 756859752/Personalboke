package com.pojo;

import java.util.Date;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private String articleid;
	private String title;
	private String zhaiyao;
	private String content;
	private Date pushdate;
	private String type;
	private String keyword;
	private String author;
	private int readcount;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** full constructor */
	public Article(String title, String zhaiyao, String content, Date pushdate,
			String type, String keyword, String author,int readcount) {
		this.title = title;
		this.zhaiyao = zhaiyao;
		this.content = content;
		this.pushdate = pushdate;
		this.type = type;
		this.keyword = keyword;
		this.author = author;
		this.readcount=readcount;
	}

	// Property accessors

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getArticleid() {
		return this.articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZhaiyao() {
		return this.zhaiyao;
	}

	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPushdate() {
		return this.pushdate;
	}

	public void setPushdate(Date pushdate) {
		this.pushdate = pushdate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Article [articleid=" + articleid + ", title=" + title
				+ ", zhaiyao=" + zhaiyao + ", content=" + content
				+ ", pushdate=" + pushdate + ", type=" + type + ", keyword="
				+ keyword + ", author=" + author + ", readcount=" + readcount
				+ "]";
	}

}