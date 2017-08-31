package com.yuan.space.dao;

import com.yuan.space.entity.User;

public interface UserDao {
	Integer addUser(User user);
	User selectUserById(Integer userId);
}
