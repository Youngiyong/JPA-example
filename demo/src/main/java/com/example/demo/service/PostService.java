package com.example.demo.service;

import com.example.demo.domain.entity.PostEntity;
import com.example.demo.domain.repository.PostCommentRepository;
import com.example.demo.domain.repository.PostRepository;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;
	
	@Autowired
	PostCommentRepository postCommentRepository;
	
	
	public PostEntity save(PostDto.RequestPost payload) {
		
		PostEntity post = new PostEntity();
	
		return post;
	}
	
	public PostEntity get(Long id) {
		
		PostEntity post = new PostEntity();
		return post;
	}
	
	public PostEntity put(PostDto.RequestPost payload) {
		
		PostEntity post = new PostEntity();
		return post;
	}
	
	public Long delete(Long id) {
		
		return id;
	}
}
