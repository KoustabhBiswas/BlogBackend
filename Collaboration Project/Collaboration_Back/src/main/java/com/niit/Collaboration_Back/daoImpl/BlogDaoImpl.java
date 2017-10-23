package com.niit.Collaboration_Back.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Collaboration_Back.dao.BlogDao;
import com.niit.Collaboration_Back.model.Blog;

@Transactional
@Repository("blogDao")
public class BlogDaoImpl implements BlogDao{
	 @Autowired
	 SessionFactory sessionFactory;

	public boolean addBlog(Blog blog) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(blog);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}

	public boolean updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(blog);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}

	public boolean deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(blog);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}

	public boolean approveBlog(Blog blog) {
		// TODO Auto-generated method stub
		try {
			blog.setBlogStatus("Active");
			sessionFactory.getCurrentSession().update(blog);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}

	public Blog getById(int id) {
		// TODO Auto-generated method stub
		return (Blog)sessionFactory.getCurrentSession().get(Blog.class, id);
	}

	public List<Blog> getAllBlog() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Blog").getResultList();
	}

}
