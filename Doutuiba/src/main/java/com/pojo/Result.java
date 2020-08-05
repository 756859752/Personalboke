package com.pojo;

/**
 * Result entity. @author MyEclipse Persistence Tools
 */

public class Result implements java.io.Serializable {

	// Fields

	private String resultid;
	private String branchappid;
	private String url;

	// Constructors

	/** default constructor */
	public Result() {
	}

	/** full constructor */
	public Result(String branchappid, String url) {
		this.branchappid = branchappid;
		this.url = url;
	}

	// Property accessors

	public String getResultid() {
		return this.resultid;
	}

	public void setResultid(String resultid) {
		this.resultid = resultid;
	}

	public String getBranchappid() {
		return this.branchappid;
	}

	public void setBranchappid(String branchappid) {
		this.branchappid = branchappid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}