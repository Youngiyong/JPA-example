package com.example.demo.dto;
import com.example.demo.domain.entity.PostCommentEntity;
import com.example.demo.domain.entity.PostEntity;

import lombok.*;

public class PostDto {
	
	@Getter
	public static class ResponseOK {
		String message = "OK";
	}

	@Getter
	public static class RequestPost {
		String name;
		String text;
		boolean isPrivate;
	}
	
	@Getter
	public static class RequestPostComment {
		String name;
		String text;
	}
	
	@Getter
	@AllArgsConstructor
	public static class ResponsePost {
		private PostEntity data;
	}
	
	
	@Getter
	@AllArgsConstructor
	public static class ResponsePostComment {
		private PostCommentEntity data;
	}
}
