package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.PostDto;
import com.example.demo.service.PostService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RequestMapping("posts")
@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
//	@PostMapping("")
//	public PostDto.ResponsePost createPost(@RequestBody PostDto.RequestPost payload){
//		return PostDto.ResponsePost(postService.save(payload));
//	}
//	
//	
//	@GetMapping("/{id}")
//	public PostDto.ResponsePost getPost(@PathVariable long id){
//		return PostDto.ResponsePost(postService.get(id));
//	}
//	
//	@PutMapping("/{id}")
//	public PostDto.ResponsePost putPost(@RequestBody PostDto.RequestPost payload, @PathVariable long id){
//		return PostDto.ResponsePost(postService.put(id, payload));
//	}
//	
//	@DeleteMapping("/{id}")
//	public PostDto.ResponseOK deletePost(@PathVariable long id){
//		return PostDto.ResponseOK(postService.delete(id));
//	}
}
