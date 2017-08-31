package com.yuan.space.service;

import com.yuan.space.entity.User;

public interface UserService {
	Integer addUser(User user);
	User selectUserById(Integer userId);
}