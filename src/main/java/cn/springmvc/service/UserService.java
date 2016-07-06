package cn.springmvc.service;

import cn.springmvc.model.User;

public interface UserService {
	public int insertUser(User user);
	public User selectUser(int id);
	public User getById(int id);
}
