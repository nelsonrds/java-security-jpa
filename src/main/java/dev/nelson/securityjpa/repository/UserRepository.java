package dev.nelson.securityjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nelson.securityjpa.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String username);
    
}
