package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.pojo.Branchapp;

public interface BranchappMapper {
	public void insertBranchapp(Branchapp Branchapp);
	public void deleteBranchapp(String Branchappid);
	public void updateBranchapp(Branchapp Branchapp);
	public Branchapp selectBranchappById(String Branchappid);
	public Integer selectBranchappCountByCondition(HashMap<String, Object> hashmap);
	public List<Branchapp> selectBranchappByCondition(HashMap<String, Object> hashmap);
}
