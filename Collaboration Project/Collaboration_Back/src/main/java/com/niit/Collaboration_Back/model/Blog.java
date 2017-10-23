package com.niit.Collaboration_Back.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int blogId;
	private String blogName;
	private String blogPost;
	private String blogStatus;
	private Date createDate;
	private int blogLikes;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogPost() {
		return blogPost;
	}
	public void setBlogPost(String blogPost) {
		this.blogPost = blogPost;
	}
	public String getBlogStatus() {
		return blogStatus;
	}
	public void setBlogStatus(String blogStatus) {
		this.blogStatus = blogStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getBlogLikes() {
		return blogLikes;
	}
	public void setBlogLikes(int blogLikes) {
		this.blogLikes = blogLikes;
	}

}
