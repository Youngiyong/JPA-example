package com.example.demo.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.*;

@Table(name = "post_comments")
@Entity
@Getter
@Setter
public class PostCommentEntity {
	
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	@Column(name = "title", nullable = false, length=255)
	private String title;
	   
	@Column(name = "text", nullable = false)
	private String text;
	
    @CreatedDate
    @Column(name = "created_at", insertable = false)
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", insertable = false)
    private LocalDateTime deletedAt;
}
