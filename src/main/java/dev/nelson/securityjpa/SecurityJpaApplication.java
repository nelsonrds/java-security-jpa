package dev.nelson.securityjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import dev.nelson.securityjpa.model.Post;
import dev.nelson.securityjpa.model.User;
import dev.nelson.securityjpa.repository.PostRepository;
import dev.nelson.securityjpa.repository.UserRepository;

@SpringBootApplication
public class SecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts, UserRepository users, PasswordEncoder passwordEncoder) {
		return args -> {
			users.save(new User("nelson", passwordEncoder.encode("password"), "ROLE_USER"));
			users.save(new User("admin", passwordEncoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));
			posts.save(new Post("Hello World", "hello-world", "Welcome to my blog", "Nelson"));
		};

	}
}
