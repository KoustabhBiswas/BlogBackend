package com.niit.Collaboration_Back.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Collaboration_Back.dao.UserDao;
import com.niit.Collaboration_Back.model.Users;

 

@Repository("userdao")
@Transactional
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	public boolean saveUser(Users user) {
		// TODO Auto-generated method stub
		try {
			System.out.println("heelo");
			sessionFactory.getCurrentSession().save(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public Users getById(int id) {
		// TODO Auto-generated method stub
		return (Users)sessionFactory.getCurrentSession().get(Users.class, id) ;
	}

	public boolean deleteUser(Users user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from users").getResultList();
	}

}
