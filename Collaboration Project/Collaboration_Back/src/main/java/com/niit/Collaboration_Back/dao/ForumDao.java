package com.niit.Collaboration_Back.dao;

import com.niit.Collaboration_Back.model.Forum;

public interface ForumDao {
	boolean addForum(Forum forum);
	boolean updateForum(Forum forum);
	boolean deleteForum(Forum forum);
	Forum getById(int id);

}
