package com.pojo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Branchapp entity. @author MyEclipse Persistence Tools
 */

public class Branchapp implements java.io.Serializable {

	// Fields

	private String branchappid;
	private String title;
	private String wenan;
	private String appid;
	private String secret;
	private String support;
	private String author;
	private String pictureone;
	private String picturetwo;
	private Date pushdate;
	ArrayList<Question> question;
	
	@Override
	public String toString() {
		return "Branchapp [branchappid=" + branchappid + ", title=" + title
				+ ", wenan=" + wenan + ", appid=" + appid + ", secret="
				+ secret + ", support=" + support + ", author=" + author
				+ ", pictureone=" + pictureone + ", picturetwo=" + picturetwo
				+ ", pushdate=" + pushdate + ", question=" + question + "]";
	}

	public ArrayList<Question> getQuestion() {
		return question;
	}

	public void setQuestion(ArrayList<Question> question) {
		this.question = question;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}


	// Constructors

	/** default constructor */
	public Branchapp() {
	}

	/** full constructor */
	public Branchapp(String title, String wenan, String appid, String secret,
			String author, String pictureone, String picturetwo, Date pushdate) {
		this.title = title;
		this.wenan = wenan;
		this.appid = appid;
		this.secret = secret;
		this.author = author;
		this.pictureone = pictureone;
		this.picturetwo = picturetwo;
		this.pushdate = pushdate;
	}

	// Property accessors

	public String getBranchappid() {
		return this.branchappid;
	}

	public void setBranchappid(String branchappid) {
		this.branchappid = branchappid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWenan() {
		return this.wenan;
	}

	public void setWenan(String wenan) {
		this.wenan = wenan;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPictureone() {
		return this.pictureone;
	}

	public void setPictureone(String pictureone) {
		this.pictureone = pictureone;
	}

	public String getPicturetwo() {
		return this.picturetwo;
	}

	public void setPicturetwo(String picturetwo) {
		this.picturetwo = picturetwo;
	}

	public Date getPushdate() {
		return this.pushdate;
	}

	public void setPushdate(Date pushdate) {
		this.pushdate = pushdate;
	}

}