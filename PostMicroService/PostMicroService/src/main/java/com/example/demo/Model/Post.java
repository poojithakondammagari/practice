package com.example.demo.Model;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	
	@Id
	private int id;
    
	private String content;
    private String comments;
    private int shares;
    private int likes;
    
    private String imageUrl;
    
	public Post() {
		super();
		
	}

	public Post(int id, String content, String comments, int shares, int likes, String imageUrl) {
		super();
		this.id = id;
		this.content = content;
		this.comments = comments;
		this.shares = shares;
		this.likes = likes;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", comments=" + comments + ", shares=" + shares + ", likes="
				+ likes + ", imageUrl=" + imageUrl + "]";
	}

	
	
    
    
	

}
