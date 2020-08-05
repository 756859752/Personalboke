package com.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import util.Utils;

import com.mapper.TtappMapper;
import com.pojo.Ttapp;
import com.service.TtappService;

@Service
public class TtappServiceImpl implements TtappService{
	@Autowired
	TtappMapper ttappMapper=null;

	@Override
	public void insertTtapp(Ttapp Ttapp) {
		// TODO Auto-generated method stub
		Ttapp.setTtappid(Utils.getNewID());
		Ttapp.setPushdate(new Date());
		ttappMapper.insertTtapp(Ttapp);
	}

	@Override
	public void deleteTtapp(String Ttappid) {
		// TODO Auto-generated method stub
		ttappMapper.deleteTtapp(Ttappid);
	}

	@Override
	public void updateTtapp(Ttapp Ttapp) {
		// TODO Auto-generated method stub
		ttappMapper.updateTtapp(Ttapp);
	}

	@Override
	public Ttapp selectTtappById(String Ttappid) {
		// TODO Auto-generated method stub
		
		return ttappMapper.selectTtappById(Ttappid);
	}

	@Override
	public Integer selectTtappCountByCondition(HashMap<String, Object> hashmap) {
		// TODO Auto-generated method stub
		return ttappMapper.selectTtappCountByCondition(hashmap);
	}

	@Override
	public List<Ttapp> selectTtappByCondition(HashMap<String, Object> hashmap) {
		// TODO Auto-generated method stub
		return ttappMapper.selectTtappByCondition(hashmap);
	}
	
}
