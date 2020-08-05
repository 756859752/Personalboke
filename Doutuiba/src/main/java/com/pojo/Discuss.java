package com.pojo;

/**
 * Discuss entity. @author MyEclipse Persistence Tools
 */

public class Discuss implements java.io.Serializable {

	// Fields

	private String discussid;
	private String userid;
	private String username;
	private Double pushdate;
	private String content;

	// Constructors

	/** default constructor */
	public Discuss() {
	}

	/** full constructor */
	public Discuss(String userid, String username, Double pushdate,
			String content) {
		this.userid = userid;
		this.username = username;
		this.pushdate = pushdate;
		this.content = content;
	}

	// Property accessors

	public String getDiscussid() {
		return this.discussid;
	}

	public void setDiscussid(String discussid) {
		this.discussid = discussid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getPushdate() {
		return this.pushdate;
	}

	public void setPushdate(Double pushdate) {
		this.pushdate = pushdate;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}