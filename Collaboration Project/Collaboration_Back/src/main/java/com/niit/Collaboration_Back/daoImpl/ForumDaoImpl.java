package com.niit.Collaboration_Back.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Collaboration_Back.dao.ForumDao;
import com.niit.Collaboration_Back.model.Forum;
@Repository("forumDao")
@Transactional
public class ForumDaoImpl implements ForumDao {
	
	 @Autowired
	 SessionFactory sessionFactory;
	@Override
	public boolean addForum(Forum forum) {
		// TODO Auto-generated method stub
		 try {
			 sessionFactory.getCurrentSession().save(forum);
			 return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

	@Override
	public boolean updateForum(Forum forum) {
		// TODO Auto-generated method stub
		 try {
			 sessionFactory.getCurrentSession().update(forum);
			 return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

	@Override
	public boolean deleteForum(Forum forum) {
		// TODO Auto-generated method stub
		 try {
			 sessionFactory.getCurrentSession().delete(forum);
			 return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

	@Override
	public Forum getById(int id) {
		// TODO Auto-generated method stub
		 
			return (Forum)sessionFactory.getCurrentSession().createQuery("from forum").getSingleResult();
			 
		 
	}

}
