package com.niit.Collaboration_Back.dao;

import java.util.List;

import com.niit.Collaboration_Back.model.Users;

public interface UserDao {
	boolean saveUser(Users user);
	boolean updateUser(Users user);
	boolean deleteUser(Users user);
	Users getById(int id);
	List<Users> getAll();
}
