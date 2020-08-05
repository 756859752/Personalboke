package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.pojo.Discuss;

public interface DiscussMapper {
	public void insertDiscuss(Discuss Discuss);
	public void deleteDiscuss(int Discussid);
	public void updateDiscuss(Discuss Discuss);
	public Discuss selectDiscussById(int Discussid);
	public List<Discuss> selectDiscussByCondition(HashMap<String, String> hashmap);
}
