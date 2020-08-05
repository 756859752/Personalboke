package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.pojo.Ttapp;

public interface TtappMapper {
	public void insertTtapp(Ttapp Ttapp);
	public void deleteTtapp(String Ttappid);
	public void updateTtapp(Ttapp Ttapp);
	public Ttapp selectTtappById(String Ttappid);
	public Integer selectTtappCountByCondition(HashMap<String, Object> hashmap);
	public List<Ttapp> selectTtappByCondition(HashMap<String, Object> hashmap);
}
