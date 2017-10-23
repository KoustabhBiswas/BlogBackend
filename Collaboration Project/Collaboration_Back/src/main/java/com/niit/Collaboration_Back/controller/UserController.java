/*package com.niit.Collaboration_Back.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Collaboration_Back.dao.BlogDao;
import com.niit.Collaboration_Back.model.Blog;

@RestController
public class UserController {
	@Autowired
	BlogDao blogDao;
	@Autowired
	Blog blog;
	
	@GetMapping(value="/get")	
	public List<Blog> getuser(){
		System.out.println("Test");
		List<Blog> list = blogDao.getAllBlog() ;
		 for(Blog b : list) {
			 System.out.println(b.getBlogName());
		 }
		return list;
	}
	@RequestMapping("/")
	public ModelAndView test() {
		return new ModelAndView("index");
	}

}
*/