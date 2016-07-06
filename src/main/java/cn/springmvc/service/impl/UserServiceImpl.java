package cn.springmvc.service.impl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDAO;
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.selectUser(id);
	}
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userDAO.getById(id);
	}
	
}
