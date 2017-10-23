package com.collaboration.collaboration_backend.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.collaboration.collaboration_backend.Dao.UserDao;
import com.collaboration.collaboration_backend.Model.Persons;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	public boolean saveUser(Persons user) {
		// TODO Auto-generated method stub
		try {
			System.out.println("heelo");
			sessionFactory.getCurrentSession().save(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public boolean updateUser(Persons user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
