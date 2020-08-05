package com.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;

@Service
public class UserServiceImpl implements UserMapper{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void insertUser(User User) {
		// TODO Auto-generated method stub
		userMapper.insertUser(User);
	}

	@Override
	public void deleteUser(int Userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectUserById(int Userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUserByCondition(HashMap<String, String> hashmap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectUserByPassLogin(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByPassLogin(user);
	}

}
