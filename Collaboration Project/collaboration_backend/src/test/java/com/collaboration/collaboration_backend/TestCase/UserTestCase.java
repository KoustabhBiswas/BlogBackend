package com.collaboration.collaboration_backend.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaboration.collaboration_backend.Dao.UserDao;
import com.collaboration.collaboration_backend.Model.Persons;

import org.junit.*;

public class UserTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static UserDao userDao;
	@Autowired
	static Persons user;
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.collaboration.collaboration_backend");
		context.refresh();
		userDao= (UserDao)context.getBean("userDao");
		user=(Persons)context.getBean("persons");
	}
	//@Ignore
	@Test
	public void save() {
		 
		//Persons user=new Persons();
		user.setUserName("priya");
		
		user.setAddress("Camac Street");
		
		user.setEmailId("biswas.koustabh@gmail.com");
		
		user.setPhoneNo(98652);
		
		
		Assert.assertEquals(true, userDao.saveUser(user));
	}
	
}
