package com.example.demo.domain.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, UUID> {
}
