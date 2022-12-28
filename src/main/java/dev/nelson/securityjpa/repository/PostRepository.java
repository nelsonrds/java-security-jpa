package dev.nelson.securityjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nelson.securityjpa.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
