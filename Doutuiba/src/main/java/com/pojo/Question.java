package com.pojo;

/**
 * Object entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private String objectid;
	private String appid;
	private String title;
	private String keya;
	private String keyb;
	private String keyc;
	private String keyd;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** full constructor */
	public Question(String appid, String title, String keya, String keyb,
			String keyc, String keyd) {
		this.appid = appid;
		this.title = title;
		this.keya = keya;
		this.keyb = keyb;
		this.keyc = keyc;
		this.keyd = keyd;
	}

	// Property accessors

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeya() {
		return this.keya;
	}

	public void setKeya(String keya) {
		this.keya = keya;
	}

	public String getKeyb() {
		return this.keyb;
	}

	public void setKeyb(String keyb) {
		this.keyb = keyb;
	}

	public String getKeyc() {
		return this.keyc;
	}

	public void setKeyc(String keyc) {
		this.keyc = keyc;
	}

	public String getKeyd() {
		return this.keyd;
	}

	public void setKeyd(String keyd) {
		this.keyd = keyd;
	}

	@Override
	public String toString() {
		return "Question [objectid=" + objectid + ", appid=" + appid
				+ ", title=" + title + ", keya=" + keya + ", keyb=" + keyb
				+ ", keyc=" + keyc + ", keyd=" + keyd + "]";
	}

}