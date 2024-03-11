package com.app.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Post;
import com.app.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {
	 private final PostRepository postRepository;

	    @Autowired
	    public PostController(PostRepository postRepository) {
	        this.postRepository = postRepository;
	    }
	    @PostMapping
	    public Post createPost(@RequestBody Post post) {
	        return postRepository.save(post);
	    }

	   // @PostMapping
	    //public void createPost(@RequestParam String content, @RequestParam User author) {
	        //Post newPost = new Post(content, author);
	        //postRepository.addPost(newPost);
	   // }

	    @GetMapping("/{postId}")
	    public Post getPostById(@PathVariable int postId) {
	        return postRepository.getPostById(postId);
	    }

	    @GetMapping
	    public List<Post> getAllPosts() {
	        return postRepository.getAllPosts();
	    }

	    @PutMapping("/{postId}")
	    public void updatePost(@PathVariable int postId, @RequestParam String newContent) {
	        Post postToUpdate = postRepository.getPostById(postId);
	        if (postToUpdate != null) {
	            postToUpdate.setContent(newContent);
	            postRepository.updatePost(postToUpdate);
	        } else {
	            throw new IllegalArgumentException("Post with ID " + postId + " does not exist.");
	        }
	    }

	    @DeleteMapping("/{postId}")
	    public void deletePost(@PathVariable int postId) {
	        postRepository.deletePost(postId);
	    }
	}

