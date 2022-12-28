package dev.nelson.securityjpa.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "post")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String slug;
    private String content;
    private String author;
    private LocalDateTime publishedOn;
    private LocalDateTime updatedOn;

    public Post(String title, String slug, String content, String author){
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.author = author;
        this.publishedOn = LocalDateTime.now();
    }
}
