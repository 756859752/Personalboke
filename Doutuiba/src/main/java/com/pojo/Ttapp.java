package com.pojo;

import java.util.Date;

/**
 * Ttapp entity. @author MyEclipse Persistence Tools
 */

public class Ttapp implements java.io.Serializable {

	// Fields
	private String ttappid;
	private String appid;
	private String image;
	private String title;
	private String wenan;
	private String suport;
	private String secret;
	private Date pushdate;
	private String author;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	// Constructors


	public Date getPushdate() {
		return pushdate;
	}

	public String getTtappid() {
		return ttappid;
	}

	public void setTtappid(String ttappid) {
		this.ttappid = ttappid;
	}

	public void setPushdate(Date pushdate) {
		this.pushdate = pushdate;
	}

	/** default constructor */
	public Ttapp() {
	}

	/** full constructor */
	public Ttapp(String appid, String image, String title, String wenan,
			String suport, String secret) {
		this.appid = appid;
		this.image = image;
		this.title = title;
		this.wenan = wenan;
		this.suport = suport;
		this.secret = secret;
	}

	// Property accessors

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getSuport() {
		return this.suport;
	}

	public void setSuport(String suport) {
		this.suport = suport;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public String toString() {
		return "Ttapp [ttappid=" + ttappid + ", appid=" + appid + ", image="
				+ image + ", title=" + title + ", wenan=" + wenan + ", suport="
				+ suport + ", secret=" + secret + ", pushdate=" + pushdate
				+ "]";
	}

}