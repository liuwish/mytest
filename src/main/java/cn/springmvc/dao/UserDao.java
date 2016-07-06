package cn.springmvc.dao;

import org.apache.ibatis.annotations.Select;

import cn.springmvc.model.User;

public interface UserDao {
	public int insertUser(User user);
	public User selectUser(int id);
	//@Select("select * from user_test where id= #{id}")
	public User getById(int id);
}
