package com.collaboration.collaboration_backend.Dao;

import com.collaboration.collaboration_backend.Model.Persons;

public interface UserDao {
	boolean saveUser(Persons user);
	boolean updateUser(Persons user);
	
}
