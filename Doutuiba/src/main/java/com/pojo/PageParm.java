package com.pojo;

public class PageParm {
	private String keyword;
	private int catstart;
	private int tpappid;
	private int pagesize;
	private String type;
	
	public int getTpappid() {
		return tpappid;
	}
	public void setTpappid(int tpappid) {
		this.tpappid = tpappid;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getCatstart() {
		return catstart;
	}
	public void setCatstart(int catstart) {
		this.catstart = catstart;
	}
	
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "PageParm [keyword=" + keyword + ", catstart=" + catstart
				+ ", catend=" + pagesize + ", type=" + type + "]";
	}
	
}
