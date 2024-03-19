package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

	List<Post> findPostByUserId(Integer userId);
	

}
