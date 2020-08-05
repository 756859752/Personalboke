package com.pojo;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String userid;
	private String passname;
	private String password;
	private String name;
	private Date rigistertime;
	private String role;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String passname, String password, String name,
			Date rigistertime, String role) {
		this.passname = passname;
		this.password = password;
		this.name = name;
		this.rigistertime = rigistertime;
		this.role = role;
	}

	// Property accessors

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassname() {
		return this.passname;
	}

	public void setPassname(String passname) {
		this.passname = passname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRigistertime() {
		return this.rigistertime;
	}

	public void setRigistertime(Date rigistertime) {
		this.rigistertime = rigistertime;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}