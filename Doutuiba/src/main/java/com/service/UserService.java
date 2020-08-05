package com.service;

import java.util.HashMap;
import java.util.List;

import com.pojo.User;

public interface UserService {
	public void insertUser(User User);
	public void deleteUser(int Userid);
	public void updateUser(User User);
	public User selectUserById(int Userid);
	public List<User> selectUserByCondition(HashMap<String, String> hashmap);
	public User selectUserByPassLogin(User user);
}
