package com.yuan.space.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.yuan.space.dao.UserDao;
import com.yuan.space.entity.User;
import com.yuan.space.service.UserService;

/**
 * 功能概要：UserService接口类
 * 
 * @author linbingwen
 * @since 2015年9月28日
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}
	
	public Integer addUser(User user) {
		return userDao.addUser(user);
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationContent.xml");
		UserService gs = (UserService)c.getBean("userService");
		
		User user = new User(2,"qq","qq");
//		user.setUserName("123");
//		user.setPassword("123");
		Integer u = gs.addUser(user);
		System.out.println(u);
		
		User a = gs.selectUserById(1);
		System.out.println(a);
	}
}